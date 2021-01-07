<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@ taglib
	uri="http://www.springframework.org/tags/form" prefix="sp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-color: lightgreen;
}
</style>
</head>
<body>
	<h1>Reservation Form</h1>
	<sp:form action="InsertGuest" method="post" modelAttribute="hotel">
		<table>
			<tr>
				<th>Guest Name</th>
				<td><sp:input path="gName" /></td>
			</tr>
			<tr>
				<th>Gender</th>
				<td><sp:select path="Gender">
						<sp:option value="male" label="Male" />
						<sp:option value="female" label="Female" />
						<sp:option value="other" label="Other" />
					</sp:select></td>
			</tr>
			<tr>
				<th>Age</th>
				<td><sp:input path="Age" /></td>
			</tr>
			<tr>
				<th>Email ID</th>
				<td><sp:input type="email" path="email" /></td>
			</tr>
			<tr>
				<th>Mobile No.</th>
				<td><sp:input path="mobile" pattern="[789][0-9]{9}" /></td>
			</tr>
		</table>
		<sp:hidden path="city" value="${hotel.city }" />
		<sp:hidden path="hName" value="${hotel.hName }" />
		<sp:hidden path="stay_date" value="${stay_date }" />
		<sp:hidden path="price" value="${hotel.price }" />
		<sp:hidden path="GST" value="${hotel.GST }" />
		<sp:hidden path="room_type" value="${hotel.room_type }" />

		<input type="submit" value="Reserve" />

	</sp:form>
</body>
</html>