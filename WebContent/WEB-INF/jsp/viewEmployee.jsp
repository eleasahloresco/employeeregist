<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee List</title>
</head>
<body>
	<h1>Employee Registration</h1>
	<c:url var="addURL" value="/addEmployee" />
	<a href="${addURL}"> Add </a> |
	<c:url var="viewURL" value="/viewEmployee" />
	<a href="${viewURL}"> Employee List </a> |
	<c:url var="searchURL" value="/searchMenu" />
	<a href="${searchURL}"> Search </a>

	<h3>Employee</h3>

	<table width="400" style="text-align: center">
		<tr>
			<th>First Name</th>
			<th>Middle Name</th>
			<th>Last Name</th>
			<th>Email Address</th>
		</tr>
		<c:forEach var="employee" items="${employees}">
			<tr>
				<td><c:out value="${employee.firstName}" /></td>
				<td><c:out value="${employee.middleName}" /></td>
				<td><c:out value="${employee.lastName}" /></td>
				<td><c:out value="${employee.email}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>