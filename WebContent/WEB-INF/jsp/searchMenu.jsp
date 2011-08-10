<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="springform" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Menu</title>
</head>
<body>
	<h1>Employee Registration</h1>
	<c:url var="addURL" value="/addEmployee" />
	<a href="${addURL}"> Add </a> |
	<c:url var="viewURL" value="/viewEmployee" />
	<a href="${viewURL}"> Employee List </a> |
	<c:url var="searchURL" value="/searchMenu" />
	<a href="${searchURL}"> Search </a>

	<h3>Search Menu</h3>

	<br />
	<h4>
		<c:url var="searchWithFieldURL" value="/searchWithField" />
		<a href="${searchWithFieldURL}"> Search With Input Fields </a>
	</h4>
	<h4>
		<c:url var="searchByTypeURL" value="/searchByType" />
		<a href="${searchByTypeURL}">Search By Type</a>
	</h4>
	
</body>
</html>