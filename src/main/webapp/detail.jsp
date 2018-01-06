<%-- 
    Document   : detail
    Created on : Jun 27, 2017, 4:33:50 PM
    Author     : Prakas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Account Id:<jsp:getProperty name="acc" property="id"/></h1>
       <h1>Account Name:<jsp:getProperty name="acc" property="name"/></h1>
    </body>
</html>
