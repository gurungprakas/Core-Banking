

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> View Page</h1>
         <table border="1">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Description</th>
                <th>Interest</th>
                <th>Minimum Balance</th>
                <th>Status</th>
            </tr>
            <c:forEach var="account" items="${requestScope.accounts}">
                <tr>
                    <td>${account.id}</td>
                    <td>${account.name}</td>
                    <td>${account.description}</td>
                    <td>${account.interest}</td>
                    <td>${account.minimumBalance}</td>
                    <td>
                        <c:choose>
                            <c:when test="${account.status}">
                                Active
                            </c:when>
                            <c:otherwise>
                                InActive
                            </c:otherwise>
                        </c:choose>
                           
                 
                        </td>
                </tr>
            </c:forEach>
        </table>
 
    </body>
</html>
