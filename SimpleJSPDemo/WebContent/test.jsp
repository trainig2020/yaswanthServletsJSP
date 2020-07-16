<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("username");
	    if(name !=null){
	    	session.setAttribute("Sessionusername", name);
	    	application.setAttribute("Applicationusername", name);
	    	pageContext.setAttribute("pagacontextusername", name);
	    	pageContext.setAttribute("Applicationusername", name, pageContext.APPLICATION_SCOPE);
	    	pageContext.findAttribute("name");
	    }
	%>

	The name is :<%=name%>
	</br>
	username in session object is : <%=session.getAttribute("Sessionusername") %>
	</br>
	username in application object is : <%= application.getAttribute("Applicationusername") %>
	</br>
	username in pagecontext object is : <%= pageContext.getAttribute("pagacontextusername") %>
</body>
</html>