<%-- 
    Document   : MovieView
    Created on : Feb 25, 2022, 4:39:08 PM
    Author     : merwinroy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Browse Movie from Database</title>
    </head>
    <body style='background-color: beige'>
        <h1>Search Panel</h1>
        <form action="browse.htm" method="POST">
        <fieldset>
            <legend><h2>Movie's Search:</h2></legend>
            <label for="keyword">Keyword: </label>
            <input type="text" name="keyword"/>
        </fieldset>
        
        <fieldset>
            <legend><h2>Browse Movie Criteria:</h2></legend>
           
            <div>
            <input type="radio" name="choice" value="titleChoice" id="titleChoice">
            <label for="titleChoice">Search by Title</label>
            </div>

            <div>
            <input type="radio" name="choice" value="actorChoice" id="actorChoice">
            <label for="actorChoice">Search by Actor</label>
            </div>

            <div>
            <input type="radio" name="choice" value="actressChoice" id="actressChoice">
            <label for="actressChoice">Search by Actress</label>
            </div>
            
        </fieldset>
        <br><br><input type='hidden' name='form' value='done'/><br>
        <input type='submit' value='Search'/>
        </form>
    </body>
</html>
