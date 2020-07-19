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
  h1 {color:red;}
  table, th, td  {
  border: 1px solid black;
  border-collapse: collapse;
  padding: 15px;
  text-align: left;
}
</style>
<title>Getting All Departments</title>
</head>
<body>
     <a href="createdept.jsp"><h1>Insert New Department</h1></a>
	<table border="2" style="width:100%" background-color: #eee;>
		<thead>
			<tr>
				<th>DeptID</th>
				<th>Dname</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach  items="${getalldept1}" var="dept">
				<tr>
					<td><c:out value="${dept.deptID}"/></td>
					<td><c:out value="${dept.deptName}" /></td>
					<td><a href="updatedepartment.jsp"><h3>update</h3></a></td>
					<td><a href="deletedepartment.jsp"><h3>Delete</h3></a></td>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
</body>
</html>