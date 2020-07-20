<%@page import="java.util.ArrayList"%>
<%@page import="com.yaswanth.dto.Department"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
h1 {
	color: red;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 15px;
	text-align: left;
}
</style>
<title>Getting All Departments</title>
</head>
<body>
	<a href="NewDepartment"><h2>Insert New Department</h2></a>
	
	<c:if test="${Register eq 'newform'}">
	<form action="CreateDepartment" method="post">
		<table border="2" style="width: 100%"background-color:#eee;>
			<thead>
				<tr>
					<th>DeptID</th>
					<th>Dname</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${getalldept1}" var="dept">
					<tr>
						<td><c:out value="${dept.deptID}" /></td>
						<td><c:out value="${dept.deptName}" /></td>
						<td><a href="updatedepartment.jsp">Update</a></td>
						<td><a href="DeleteDepartment?DeptID=${dept.deptID}"><h3>Delete</h3></a></td>
					</tr>
				</c:forEach>
				<tr>
					<td><input type="text" name="DeptID" /></td>
					<td><input type="text" name="DeptName" /></td>
					<td colspan="2" align="center"><input type="submit" value="save" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</c:if>
<c:if test="${Register ne 'newform'}">
	<form>
		<table border="2" style="width: 100%"background-color:#eee;>
			<thead>
				<tr>
					<th>DeptID</th>
					<th>Dname</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${getalldept1}" var="dept">
					<tr>
						<td><c:out value="${dept.deptID}" /></td>
						<td><c:out value="${dept.deptName}" /></td>
						<td><a href="updatedepartment.jsp">Update</a></td> 
						<td><a href="DeleteDepartment?DeptID=${dept.deptID}"><h3>Delete</h3></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</c:if>
</body>
</html>
