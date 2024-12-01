<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${pageTitle}</title>
</head>
<body>

<h1>Welcome to Make My Trip Application</h1>
<form action="bookTicket" method="post" >
    <table>
        <tr>
            <td>firstName</td>
            <td><input name="firstName"  ></td>
        </tr>
        <tr>
            <td>lastName</td>
            <td><input name="lastName"></td>
        </tr>
        <tr>
            <td>age</td>
            <td><input name="age"></td>
        </tr>
        <tr>
            <td>from</td>
            <td><input name="from"></td>
        </tr>
        <tr>
            <td>to</td>
            <td><input name="to"></td>
        </tr>
        <tr>
            <td>email</td>
            <td><input name="email"></td>
        </tr>
        <tr>
            <td>
                trainNumber
            </td>
            <td><input name="trainNumber"></td>
        </tr>

    </table>
    <input type="submit" value="book">
</form>

<a href="search">search</a>

</body>
</html>
<%--private String firstName;
    private String lastName;
    private int age;
    private String from;
    private String to;
    private String email;
    private String trainNumber;--%>