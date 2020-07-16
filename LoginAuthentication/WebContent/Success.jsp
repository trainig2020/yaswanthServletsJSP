<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.yaswanth.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>

<h2>Login Successful! Congraulations</h2>

<%--
  User u = (User)request.getAttribute("user");
--%>

<jsp:useBean id="user" class="com.yaswanth.dto.User" scope="request"></jsp:useBean>

<jsp:getProperty property="userName" name="user"/>


 <%--=u.getUserName() --%>
</body>
</html>