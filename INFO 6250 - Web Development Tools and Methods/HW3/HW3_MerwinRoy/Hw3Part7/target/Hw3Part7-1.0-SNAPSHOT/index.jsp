<%-- 
    Document   : index
    Created on : Feb 25, 2022, 9:52:15 PM
    Author     : merwinroy
--%>
<%@page import = "com.mycompany.hw3part7.Books"%>
<%@page session = "true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Number of books to add</title>
    </head>
    <body style="background-color: beige">
        <fieldset>
            <legend><h1>Welcome to BookStore</h1></legend>
            <Form action="books.do" method="POST">
                <label for="bookNo">Enter the number of books to add in Database: </label>
                <input type="text" name="bookNo"/>
                <input type="submit" value="Submit"/>
            </Form>  
        </fieldset>
    </body>
</html>