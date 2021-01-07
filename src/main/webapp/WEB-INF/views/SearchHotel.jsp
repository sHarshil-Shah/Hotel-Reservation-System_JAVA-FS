<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: lightblue;
}
</style>
</head>
<body>
	<h1>Search Hotels</h1>
	<sp:form action="GoToConfirmation" method="post" modelAttribute="hotel">
		<table>
			<tr>
				<td>Select City:</td>
				<td><sp:select path="city">
						<sp:option value="Banglore" label="Banglore" />
						<sp:option value="Hyderabad" label="Hyderabad" />
						<sp:option value="Chennai" label="Chennai" />
						<sp:option value="Delhi" label="Delhi" />
					</sp:select></td>
			</tr>
			<tr>
				<td>Select Hotel:</td>
				<td><sp:select path="hName">
						<sp:option value="Oberoi" label="The Oberoi" />
						<sp:option value="Amaznbagh" label="Amaznbagh" />
						<sp:option value="Taj" label="Taj Lake Palace" />
						<sp:option value="Ananda" label="Ananda" />
					</sp:select></td>
			</tr>
			<tr>
				<td>Enter Date:</td>
				<td><sp:input type="date" path="stay_date" /></td>
			</tr>
			<%-- 	<sp:hidden path="price" value="10000" />
			<sp:hidden path="GST" value="5000" />--%>
			<sp:hidden path="room_type" value="Standard" />
			<tr>
				<td style="text-align: center;" colspan="2"><input
					type="submit" value="Check Availability" /></td>
			</tr>
		</table>
	</sp:form>
	<div>${error }</div>
</body>
</html>