<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Employee</title>
</head>
<body>
	<h1>Employee Registration</h1>
	<c:url var="addURL" value="/addEmployee" />
	<a href="${addURL}"> Add </a>
	|
	<c:url var="viewURL" value="/viewEmployee" />
	<a href="${viewURL}"> Employee List </a>
	| 
	<c:url var="searchURL" value="/searchMenu" />
	<a href="${searchURL}"> Search </a>
	
	<h3>Add Employee</h3>
	
	<c:url var="submitURL" value="/addEmployee" />
	
	<springform:form commandName="employeeModel" maction="${submitURL}" method="POST">
		<select name="type">
				<option value="1">Software Developer</option>
				<option value="2">Business Analyst</option>
				<option value="3">Project Manager</option>
		</select>
		
		<br />
	
		<springform:label path="firstName">First Name</springform:label>
		<springform:input path="firstName"/>
		<springform:errors path="firstName" />
		
		<br />
		
		<springform:label path="middleName">Middle Name</springform:label>
		<springform:input path="middleName"/>
		<springform:errors path="middleName" />
		
		<br />
		
		<springform:label path="lastName">Last Name</springform:label>
		<springform:input path="lastName"/>
		<springform:errors path="lastName" />
		
		<br />
		
		<springform:label path="email">Email Address</springform:label>
		<springform:input path="email"/>
		<springform:errors path="email" />
		
		<br />
		
		<input type="submit" value="Add Employee"/>
	</springform:form>

</body>
</html>