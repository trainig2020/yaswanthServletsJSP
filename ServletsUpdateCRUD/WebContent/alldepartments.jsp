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
							<td><a href="updatedepartment.jsp"><h3>Update</h3></a></td>
							<td><a href="DeleteDepartment?DeptID=${dept.deptID}"><h3>Delete</h3></a></td>
						</tr>
					</c:forEach>
					<tr>
						<td><input type="text" name="DeptID" /></td>
						<td><input type="text" name="DeptName" /></td>
						<td colspan="2" align="center"><input type="submit"
							value="save" /></td>
					</tr>
				</tbody>
			</table>
		</form>
	</c:if>
	<c:if test="${Register ne 'newform'}">
		<form action="UpdateDepartment" method="post">
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
					
					      <c:if test="${department.deptID eq dept.deptID}">
						<tr>
							<td><input type="text" name="DeptID"
								value="${department.deptID}" readonly="readonly" /></td>
							<td><input type="text" name="DeptName"
								value="${department.deptName}" /></td>
							<td><input type="submit" value="update" /></td>
						</tr>
					</c:if>
					<c:if test="${department.deptID ne dept.deptID}">
						<tr>
							<td><c:out value="${dept.deptID}" /></td>
							<td><c:out value="${dept.deptName}" /></td>
							<td><a href="GetDepartment?DeptID=${dept.deptID}">Update</a></td> 
							<td><a href="DeleteDepartment?DeptID=${dept.deptID}"><h3>Delete</h3></a></td>
						</tr>
					</c:if>
					</c:forEach>
				</tbody>
			</table>
		</form>
	</c:if>
</body>
</html>
