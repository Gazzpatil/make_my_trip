<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>

</head>
<body>
<h1>succesfully booked</h1>

<table>
    <tr><td>ticketId</td>
    <td>${ticket.ticketId}</td></tr>
    <tr><td>from</td>
        <td>${ticket.from}</td></tr>
    <tr><td>to</td>
        <td>${ticket.to}</td></tr>
    <tr><td>train number</td>
        <td>${ticket.trainNumber}</td></tr>
    <tr><td>ticketPrice</td>
        <td>${ticket.ticketPrice}</td></tr>
    <tr><td>ticketStatus</td>
        <td>${ticket.ticketStatus}</td></tr>
    <tr><td>PassengerName</td>
        <td>${ticket.passengerName}</td></tr>
</table>
<h3><a href="${pageContext.request.contextPath}/home">Back to Booking platform</a></h3>
</body>
</html>

<%-- private String ticketId;
    private String from;
    private String to;
    private String trainNumber;
    private String ticketPrice;
    private String ticketStatus;
    private String passengerName;--%>