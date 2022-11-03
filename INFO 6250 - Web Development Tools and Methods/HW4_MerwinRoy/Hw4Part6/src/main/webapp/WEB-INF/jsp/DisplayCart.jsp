<%-- 
    Document   : DisplayCart
    Created on : Feb 27, 2022, 12:05:36 AM
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
        <title>Display Cart</title>
    </head>
    <body style='background-color: beige'>
        <h1>Cart Items:</h1>
        <div>
            <form action="RemoveCart.htm" method="GET">
            <c:forEach items="${sessionScope.Cart}" var="product">
               <input type="checkbox" name="productsRemove" value="${product}"> ${product}<br/>
            </c:forEach>
               <input type="hidden" name="Cart" value="RemoveCart"/>
                <input type='submit' value='Remove from Cart'/>
            </form>
        </div>
        <div>
            <span><a href="Books.htm">| Books page |</a></span>
            <span><a href="Computers.htm">| Computers page |</a></span>
            <span><a href="Music.htm">| Music page |</a></span>
            <span><a href="index.htm">|  Home page |</a></span>
        </div> 
    </body>
</html>
