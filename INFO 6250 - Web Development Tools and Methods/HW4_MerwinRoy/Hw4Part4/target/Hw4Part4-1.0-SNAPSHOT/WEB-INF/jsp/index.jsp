<%@page import = "com.webtools.hw4part4.pojo.Movie"%>
<%@page session = "true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Movie Store</title>
    </head>
    <body style="background-color: beige">
        <form action="movie.htm" method="Post">
            <h1>Welcome to Movie Store</h1><br>
            <label for="movieSend">Please make your selection below: </label>
            <select id="movieSend" name="movieSend">
                <option value="browse">Browse Movies</option>
                <option value="addMovies">Add New Movies to Database</option>
            </select>
            <input type="submit" value="submit">
            
            
            
        </form>
    </body>
</html>
