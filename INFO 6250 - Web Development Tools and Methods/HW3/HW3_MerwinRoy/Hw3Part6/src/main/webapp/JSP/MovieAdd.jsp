<%-- 
    Document   : MovieAdd
    Created on : Feb 25, 2022, 4:39:23 PM
    Author     : merwinroy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Movie to database</title>
    </head>
    <body style='background-color: beige'>
        <h1>Add Movies to Database - Panel</h1>
        <form action="Add" method="POST">
        <fieldset>
            <legend><h2>Enter Movie details</h2></legend>
            <label for='movieTitle'>Movie Title:</label>
            <input type='text' name='movieTitle'>
            <br><br>
            
            <label for='leadActor'>Lead Actor:</label>
            <input type='text' name='leadActor'>
            <br><br>
            
            <label for='leadActress'>Lead Actress:</label>
            <input type='text' name='leadActress'>
            <br><br>
            
            <label for='movieGenre'>Movie Genre:</label>
            <input type='text' name='movieGenre'>
            <br><br>
            
            <label for='year'>Year:</label>
            <input type='text' name='year'>
            <br><br>
            
        </fieldset>
        <br><br><input type='submit' value='Add Movie'>
        </form>
    </body>
</html>
