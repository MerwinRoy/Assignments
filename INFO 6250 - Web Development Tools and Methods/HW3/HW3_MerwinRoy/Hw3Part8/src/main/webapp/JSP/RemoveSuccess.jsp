<%-- 
    Document   : RemoveSuccess
    Created on : Feb 27, 2022, 12:02:56 AM
    Author     : merwinroy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete from Cart</title>
    </head>
    <body style='background-color: beige'>
        <h1>Items selected have successfully been deleted from cart</h1>
        <div>
            <c:forEach items="${requestScope.productsRemove}" var="product">
                ${product}<br/>
            </c:forEach>
        </div>
        <div>
            <span><a href="Books.jsp">| Books page |</a></span>
            <span><a href="Computers.jsp">| Computers page |</a></span>
            <span><a href="Music.jsp">| Music page |</a></span>
            <span><a href="../index.jsp">|  Home page |</a></span>
        </div> 
    </body>
</html>
