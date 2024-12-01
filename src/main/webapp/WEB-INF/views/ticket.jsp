<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE Html>
<html>
<head>

</head>
<body>
<h2>
    Search the Ticket
</h2>

<form action="ticketId" method="get">
    <table>
        <tr>
            <td>Enter ticketId</td>
            <td><input name="ticketId"></td>
        </tr>
    </table>
    <input type="submit" value="search">
</form>

</body>
</html>