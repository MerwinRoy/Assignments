<%-- 
    Document   : Music.jsp
    Created on : Feb 26, 2022, 3:38:38 PM
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
            <legend><h1>Music Selection (Shop for CD's):</h1></legend>
            
            <form action="AddCart" method="POST">
            <input type="checkbox" name="productSelected" value="I'm Going to Tell You a Secret by Madonna[$26.99]"/>I'm Going to Tell You a Secret by Madonna[$26.99]<br>
            
            <input type="checkbox" name="productSelected" value="Baby One More Time by Britney Spears[$10.95]"/>Baby One More Time by Britney Spears[$10.95]<br>
            
            <input type="checkbox" name="productSelected" value="Justified by Justin Timberlake[$9.97]"/>Justified by Justin Timberlake[$9.97]<br>
            
            <input type="checkbox" name="productSelected" value="Loose by Nelly Furtado[$13.98]"/>Loose by Nelly Furtado[$13.98]<br>
            
            <input type="checkbox" name="productSelected" value="Gold Digger by Kanye West[$27.99]"/>Gold Digger by Kanye West[$27.99]<br><br>
            
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
