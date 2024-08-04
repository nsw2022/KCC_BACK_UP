<%@page import="kosa.model.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("utf-8");
	
	request.setAttribute("name", "kosa");
	

	Person person = new Person("kosa");
	request.setAttribute("person", person);
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="jstl_exam.jsp">
	<jsp:param value="orange" name="fruit"/>
</jsp:forward>
</body>
</html>