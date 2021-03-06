<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-color: lightgreen;
}

#btnConfirm {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
}
</style>
</head>
<body>
	<sp:form action="CheckReservation" method="post" modelAttribute="hotel">
		<table>
			<tr>
				<th>Room Type:</th>
				<td>${hotel.room_type}</td>
			</tr>


			<tr>
				<th>Price:</th>
				<td>${hotel.price}</td>
			</tr>

			<tr>
				<th>GST:</th>
				<td>${hotel.GST}</td>
			</tr>


			<tr>
				<th>Total:</th>
				<td>${hotel.price+hotel.GST}</td>
			</tr>
		</table>
		<sp:hidden path="city" value="${hotel.city }" />
		<sp:hidden path="hName" value="${hotel.hName }" />
		<sp:hidden path="price" value="${hotel.price }" />
		<sp:hidden path="GST" value="${hotel.GST }" />
		<sp:hidden path="room_type" value="${hotel.room_type }" />
		<sp:hidden path="stay_date" value="${hotel.stay_date }" />

		<input id="btnConfirm" type="submit" value="Confirm" />
		<input type="button" value="Back"
			onclick="window.location.href = 'http://localhost:2/HotelReservation/PreInsertHotel'" />
	</sp:form>
</body>
</html>