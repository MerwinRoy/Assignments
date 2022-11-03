<%-- 
    Document   : BrowseResult
    Created on : Feb 25, 2022, 7:56:08 PM
    Author     : merwinroy
--%>
<%@page import= "com.mycompany.hw3part6.Movie"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page session="true" %>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movie Search Results</title>
    </head>
    <body style="background-color: beige">
        
        <fieldset>
            
        <legend><h1>Search Results</h1></legend>
        
        <c:forEach items = "${requestScope.MovieSearch}" var="mov">
            Movie Title: <c:out value="${mov.getTitle()}"/><br>
            Movie Actor: <c:out value="${mov.getActor()}"/><br>
            Movie Actress: <c:out value="${mov.getActress()}"/><br>
            Movie Genre: <c:out value="${mov.getGenre()}"/><br>
            Movie Year: <c:out value="${mov.getYear()}"/><br>
            <hr>
        </c:forEach>
        </fieldset>
    </body>
</html>
