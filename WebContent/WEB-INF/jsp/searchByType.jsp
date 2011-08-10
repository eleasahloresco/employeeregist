<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search By Type</title>
</head>
<body>
	<h1>Employee Registration</h1>
	<c:url var="addURL" value="/addEmployee" />
	<a href="${addURL}"> Add </a> |
	<c:url var="viewURL" value="/viewEmployee" />
	<a href="${viewURL}"> Employee List </a> |
	<c:url var="searchURL" value="/searchMenu" />
	<a href="${searchURL}"> Search </a>

	<c:url var="submitURL" value="/searchByTypeResults" />
	<h3>Search by Type</h3>
		<form method="POST" action="${submitURL}">
			<select name="type">
				<option value="SoftwareDeveloper">Software Developer</option>
				<option value="BusinessAnalyst">Business Analyst</option>
				<option value="ProjectManager">Project Manager</option>
			</select>
			
			<input type="submit" value="Search" />
		</form>
		
		

</body>
</html>