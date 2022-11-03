<%-- 
    Document   : Books.jsp
    Created on : Feb 26, 2022, 3:38:26 PM
    Author     : merwinroy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books Page</title>
        <style>
            ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #333333;
            }

            li {
                float: left;
            }

            li a {
                display: block;
                color: white;
                text-align: center;
                padding: 16px;
                text-decoration: none;
            }

            li a:hover {
                background-color: #111111;
            }
        </style>
    </head>
    <body style="background-color: beige">
        <ul>
            <li><a href="Books.jsp">Books</a></li>
            <li><a href="Music.jsp">Music</a></li>
            <li><a href="Computers.jsp">Computers</a></li>
        </ul>
        
        <form action="ItemCart" method="POST">
            
        <fieldset>
            <legend><h1>Book Selection:</h1></legend>
            
            <form action="AddCart" method="GET">
            <input type="checkbox" name="productSelected" value="Java Servlet Programming[$29.95]"/>Java Servlet Programming[$29.95]<br>
            
            <input type="checkbox" name="productSelected" value="Oracle Database Programming[$48.95]"/>Oracle Database Programming[$48.95]<br>
            
            <input type="checkbox" name="productSelected" value="System Analysis and Design with UML[$14.95]"/>System Analysis and Design with UML[$14.95]<br>
            
            <input type="checkbox" name="productSelected" value="Object Oriented Software Engineering[$35.99]"/>Object Oriented Software Engineering[$35.99]<br>
            
            <input type="checkbox" name="productSelected" value="Java Web Services[$27.99]"/>Java Web Services[$27.99]<br><br> 
            
            <input type="hidden" name="Cart" value="FillCart"/>
            <input type='submit' value='Add to Cart'/>
            </form>
            
            
            <form action="DisplayCart" method="GET">
                <input type="hidden" name="Cart" value="DisplayCart"/>
                <input type='submit' value='Display Cart'/>
            </form>
            
        </fieldset>
        

        

    </body>
</html>
