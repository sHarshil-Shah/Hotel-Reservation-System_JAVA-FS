<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sp:form modelAttribute="hotel">
		${hotel.hName}
		<br /> Dear ${hotel.gName }, Thank you for choosing ${hotel.hName}.
		<br /> It is our pleasure to confirm your reservation.
	</sp:form>
</body>
</html>