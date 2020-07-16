<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>HI ALL</h4>
	<%
		int i = 2;
		int j = 4;
		int k;

		k = i + j;
	%>

	The value of k is :<%=k%>!!!!!!!

	<%!public int add(int a, int b) {
		return a + b;
	}%>
	<%
		k = add(1234, 5647);
	%>

	<h1>
		The value of k is :<%=k%></h1>

	<%
		for (int g = 0; g < 10; g++) {
	%>
	</br> The value of g is :
	<%=g%>

	<%
		}
	%>
</body>
</html>