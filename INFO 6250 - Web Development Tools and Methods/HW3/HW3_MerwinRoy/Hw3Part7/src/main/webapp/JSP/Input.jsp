<%-- 
    Document   : Input
    Created on : Feb 26, 2022, 2:14:15 PM
    Author     : merwinroy
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add books to Database</title>
    </head>
    <body style="background-color: beige">
        <form action="books.add" method="POST">
        <fieldset>
            <legend><h1>Please Enter the Details Below</h1></legend>
            <table border=1>
            <tr>
                <th>ISBN</th>
                <th>Title</th>
                <th>Authors</th>
                <th>Price</th>
            </tr>
          
            <c:forEach begin="1" end="${requestScope.bookNo}">
                   
                <tr>
                    <td>
                        <input type="text" id="ISBN" name="ISBN" required />
                    </td>
                    <td>
                        <input type="text" id="Title" name="Title" required />
                    </td>
                    <td>
                        <input type="text" id="Authors" name="Authors" required />
                    </td>
                    <td>
                        <input type="number" id="Price" name="Price" required />
                    </td>
                </tr>
                
            </c:forEach>
                
            </table>
            
            <br><br>
            
            <input type='hidden' name='bookNo' value="${requestScope.bookNo}"/>
            
            <input type="submit" value="Add">
            
        </fieldset>
            
        </form>
    </body>
</html>
