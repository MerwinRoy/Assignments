<%-- 
    Document   : Computers.jsp
    Created on : Feb 26, 2022, 3:38:58 PM
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
            <li><a href="Books.htm">Books</a></li>
            <li><a href="Music.htm">Music</a></li>
            <li><a href="Computers.htm">Computers</a></li>
        </ul>
        
        
            
        <fieldset>
            
            <legend><h1>Computers Selection (Shop for Laptops):</h1></legend>
            <form action="ItemCart.htm" method="GET">
            <input type="checkbox" name="productSelected" value="Apple Macbook Pro with 13.3" Display [$1299.99]"/>Apple Macbook Pro with 13.3" Display [$1299.99]<br>
            
            <input type="checkbox" name="productSelected" value="Asus Laptop with Centrino [$949.95]"/>Asus Laptop with [$949.95]<br>
            
            <input type="checkbox" name="productSelected" value="HP Pavilion Laptop with Centrino 2 DV7 [$1199.95]c"/>HP Pavilion Laptop with 2 DV7 [$1199.95]<br>
            
            <input type="checkbox" name="productSelected" value="Toshiba Satellite Laptop with Centrino 2 - Copper [$899.99]"/>Toshiba Satellite Laptop with Centrino 2 - Copper [$899.99]<br>
            
            <input type="checkbox" name="productSelected" value="Sony VAIO Laptop with Core 2 Duo Cosmopolitan Pink [$779.99]"/>Sony VAIO Laptop with Core 2 Duo Cosmopolitan Pink [$779.99]<br><br> 
            
            <input type="hidden" name="Cart" value="FillCart"/>
            <input type='submit' value='Add to Cart'/>
            </form>
            
            <form action="DisplayCart.htm" method="GET">
                <input type="hidden" name="Cart" value="DisplayCart"/>
                <input type='submit' value='Display Cart'/>
            </form>
            
        </fieldset>
       

        
    </body>
</html>
