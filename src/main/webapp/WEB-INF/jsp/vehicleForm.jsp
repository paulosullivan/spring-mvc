<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='form' uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style>
		.error {
			color: #ff0000;
		}
		 
		.errorblock {
			color: #000;
			background-color: #ffEEEE;
			border: 3px solid #ff0000;
			padding: 8px;
			margin: 16px;
		}
	</style>
</head>
 
<body>
	<h2>Add Vehicle</h2>
 
	<form:form method="POST" commandName="vehicle" action="vehicle">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Make :</td>
				<td><form:input path="make" /></td>
				<td><form:errors path="make" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Model :</td>
				<td><form:input path="model" /></td>
				<td><form:errors path="model" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Year :</td>
				<td><form:input path="year" /></td>
				<td><form:errors path="year" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Guide Price :</td>
				<td><form:input path="guidePrice" /></td>
				<td><form:errors path="guidePrice" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
 
</body>
</html>