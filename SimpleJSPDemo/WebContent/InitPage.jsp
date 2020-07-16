<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!

  public void jspInit(){
	String defaultuser = getServletConfig().getInitParameter("DefaultUser");
	ServletContext context = getServletContext();
	context.setAttribute("defaultuser", defaultuser);
}
    


%>

The Default value from servlet config is :<%=getServletConfig().getInitParameter("DefaultUser") %>

The Default value from servlet context is :<%=getServletContext().getAttribute("defaultuser") %>
</body>
</html>