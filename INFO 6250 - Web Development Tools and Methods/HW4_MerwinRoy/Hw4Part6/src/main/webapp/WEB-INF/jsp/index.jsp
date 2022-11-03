<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
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
    <% 
        if(request.authenticate(response))
        {
    %>
    <body style="background-color: beige">

        <h1>Welcome to Store: Home Page</h1>
        <ul>
            <li><a href="Books.htm" >Books</a></li>
            <li><a href="Music.htm" >Music</a></li>
            <li><a href="Computers.htm" >Computers</a></li>
        </ul>
        
        <fieldset>
            <legend><h2>Directions: </h2></legend>
            
            <p>Click on one of the following options to check out different products:</p>
            
            <ol>
                <li><b>Books Link:</b> To check and purchase books available in store.</li>
                <li><b>Music Link:</b> To check and purchase music available in store.</li>
                <li><b>Computers Link:</b> To check and purchase computers available in store.</li>
            </ol>
            
        </fieldset>
        
 
    </body>
    <%
        }
        else{
            out.println("Failure to authenticate...");
        }
    %>
</html>
