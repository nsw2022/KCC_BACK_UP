<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
    session = request.getSession();
    String name = null;
    
    if (session != null && session.getAttribute("name") != null) {
        name = URLDecoder.decode((String) session.getAttribute("name"), "UTF-8");
    }else{
    	response.sendRedirect("loginForm.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b><%= name %> 반갑습니다.</b>
	<a href="logout.jsp">로그아웃</a>
</body>
</html>