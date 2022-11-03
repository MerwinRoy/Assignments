<%-- 
    Document   : Index
    Created on : Feb 26, 2022, 8:45:04 PM
    Author     : merwinroy
--%>
<jsp:directive.page import="java.util.*"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Tags</title>
    </head>
    <body style="background-color: beige">
        <h1>
        <fieldset>
            <legend><h1>Core Tags</h1></legend>
            <c:out value="Example of <c:out> tag"></c:out><br>
            <c:out value="Multiplication of 2 for numbers 1-10 using <c:forEach> tag"></c:out><br>
            <hr>
            <c:forEach var="i" begin="1" end="10">
                Result -> ${i}: ${i*2} <br>
            </c:forEach>
            <hr>
            <c:set var="Name" value="Merwin"></c:set><br>
            <c:out value="Setting value of var='Name' as 'Merwin' using <c:set> tag =>"></c:out><br>
            <c:out value="Name: ${Name}"></c:out><br>
            <hr>
        </fieldset>
            
        <fieldset>
            <legend><h1>Formatting Tags</h1></legend>
            <c:set var="now" value="<%= new java.util.Date()%>"></c:set><br>
            <c:out value = "Formatted Date example using <fmt:formatDate> tag to display date and time: "></c:out>
            <fmt:formatDate type="both" value="${now}"></fmt:formatDate><br>
            <hr>
            
            <c:out value= "Formatted TimeZone example using <fmt:timeZone> tag to display India's timezone:"></c:out><br>
            <c:set var="present" value="<%=new java.util.Date()%>"/>
            
            <fmt:timeZone value="India">
                <fmt:formatDate value="${present}" type="both" />
            </fmt:timeZone>
            <hr>
            <c:out value="Using <fmt:bundle> and <fmt:message> tags"></c:out><br>
            <fmt:bundle basename="com.mycompany.hw3part3" prefix="fruit.">  
            <fmt:message key="Mango"/><br/>  
            <fmt:message key="Orange"/><br/>  
            <fmt:message key="Banana"/><br/>  
  
            </fmt:bundle>  
        </fieldset>
            
        <fieldset>
            <legend><h1>Function Tags</h1></legend>
        <c:set var="sentence" value="MY NAME IS Merwin Roy"/> <br>
        <c:if test= "${fn:contains(sentence,'Merwin')}">
            <c:out value="Using <c:if> and [fn:contains tags]: The sentence contains the word 'Merwin'"></c:out><br>
        </c:if>
        <hr>
        <c:out value="Sentence converted to LowerCase String using [fn:toLowerCase()]:"></c:out>
        <p>LowerCase: ${fn:toLowerCase(sentence)}</p>
        <hr>
        <c:out value="Length of Sentence using [fn:length()]: "></c:out>
        <p>Length:${fn:length(sentence)}</p>
        <hr>
        
        
        </fieldset>
        
        <fieldset>
            <legend><h1>SQL Tags</h1></legend>
            <c:out value="Used <sql:setDataSource> tag for prototyping "></c:out>
            <sql:setDataSource var="db" driver="org.postgresql.Driver"  url="jdbc:postgresql://localhost:5432/moviedb" user="postgres"  password="password"/>
            <hr>
            <sql:update dataSource="${db}" var="count">  
                INSERT INTO public.movies("Title","Actor","Actress","Genre","Year") VALUES ('{Forrest Gump}','{Tom Hanks}','{Robin Wright}','{Drama/Romance}','{1994}');
            </sql:update>
 
            <c:out value="Used <sql:update> and <sql:query> tag to update (insert new movie details) and select all details from table 'movies' of 'moviedb' database "></c:out>
            <!-- All columns are of type 'character varying[]' -->
            <sql:query dataSource="${db}" var="mov">  
                SELECT * from public.movies;  
            </sql:query> 
            <table border="1">
                <caption><h2>Movies List - Database</h2></caption>
                <tr>
                    <th>Title</th>
                    <th>Actor</th>
                    <th>Actress</th>
                    <th>Genre</th>
                    <th>Year</th>
                </tr>
                <c:forEach var="movie" items="${mov.rows}">
                    <tr>
                        <td><c:out value="${movie.Title}" /></td>
                        <td><c:out value="${movie.Actor}" /></td>
                        <td><c:out value="${movie.Actress}" /></td>
                        <td><c:out value="${movie.Genre}" /></td>
                        <td><c:out value="${movie.Year}" /></td>
                    </tr>
                </c:forEach>
            </table>
        </fieldset>
        <fieldset>
            <legend><h1>XML Tags</h1></legend> 
            <c:set var = "Cinemaxml">
            <movies>  
                <movie>  
                    <name>Titanic</name>  
                    <actor>Leonardo Di Caprio</actor>  
                    <genre>Disaster/Romance</genre>  
                </movie>  
                <movie>  
                    <name>Mission Impossible</name>  
                    <actor>Tom Cruise</actor>  
                    <genre>Action</genre>  
                </movie>
                <movie>
                    <name>Ring</name>
                    <actor>Naomi Watts</actor>
                    <genre>Horror</genre>
                </movie>
            </movies>  
            </c:set>
        <c:out value="Used <x:parse> and <x:out> tags to parse through cinemaxml and display movie names,actors and genres"></c:out>

            <x:parse xml = "${Cinemaxml}" var = "cinema"/>
                <p>First Movie Name: <x:out select="$cinema/movies/movie[1]/name" /></p>  
                <p>First Movie Actor: <x:out select="$cinema/movies/movie[1]/actor" /></p>  
                <p>First Movie genre: <x:out select="$cinema/movies/movie[1]/genre" /></p>  
                <p>Second Movie Name: <x:out select="$cinema/movies/movie[2]/name" /></p>  
                <p>Second Movie Actor: <x:out select="$cinema/movies/movie[2]/actor" /></p>  
                <p>Second Movie genre: <x:out select="$cinema/movies/movie[2]/genre" /></p> 
                <p>Third Movie Name: <x:out select="$cinema/movies/movie[3]/name" /></p>  
                <p>Third Movie Actor: <x:out select="$cinema/movies/movie[3]/actor" /></p>  
                <p>Third Movie genre: <x:out select="$cinema/movies/movie[3]/genre" /></p> 
                <hr>
                
            
        <c:out value="Used <x:if> to check condition"></c:out>

            <x:parse xml = "${Cinemaxml}" var = "cinema"/>
            <x:if select = "$cinema/movies">
                Document has at least one movie element.
            </x:if>
            
        </fieldset>
        
    </body>
</html>
