<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Registration</title>
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
	
</body>
</html>