<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Spring MVC demo project!</h1>

	<a href="<c:url value="/showAddAdminForm"></c:url>">Add Admin</a>
	<a href="<c:url value="/showAddStudentForm"></c:url>">Add Student</a>
	<a href="<c:url value="/showAddEmployeeForm"></c:url>">Add Employee</a>
	<a href="<c:url value="/showDelEmployee"></c:url>">Delete Employee</a>
	<a href="<c:url value="/showDelStudent"></c:url>">Delete Student</a>
	<a href="<c:url value="/showMakeFormForm"></c:url>">Make Form</a>
</body>
</html>