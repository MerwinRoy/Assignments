<%-- 
    Document   : view
    Created on : Mar 7, 2022, 9:18:45 PM
    Author     : merwinroy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Page</title>
    </head>
    <body>
        String: ${requestScope.string}
        <hr/>
        Scope: ${requestScope.scope}
    </body>
</html>
