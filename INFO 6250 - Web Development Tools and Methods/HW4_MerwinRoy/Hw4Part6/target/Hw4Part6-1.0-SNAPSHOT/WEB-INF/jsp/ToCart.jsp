<%-- 
    Document   : ToCart.jsp
    Created on : Feb 27, 2022, 12:10:16 AM
    Author     : merwinroy
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Items added to Cart</title>
    </head>
    <body style="background-color: beige">
        <h1>Items added: </h1>
        <div>
            <c:forEach items="${requestScope.productsSelected}" var="product">
                ${product}<br/>
            </c:forEach>
        </div>
        <div>
            <span><a href="Books.htm">| Books page |</a></span>
            <span><a href="Computers.htm">| Computers page |</a></span>
            <span><a href="Music.htm">| Music page |</a></span>
            <span><a href="index.htm">|  Home page |</a></span>
        </div>    
    </body>
</html>
