<%@page import = "com.webtools.hw4part5.pojo.Books"%>
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
            <Form action="book.htm" method="POST">
                <label for="bookNo">Enter the number of books to add in Database: </label>
                <input type="text" name="bookNo"/>
                <input type="submit" value="Submit"/>
            </Form>  
        </fieldset>
    </body>
</html>
