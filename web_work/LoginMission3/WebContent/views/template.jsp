<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String mainUrl = "board/"+request.getAttribute("mainPage")+".jsp";

%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="">
	<tr>
		<td ><jsp:include page="Inc/header.jsp"/></td>
	</tr>
	<tr>
		<td ><jsp:include page="<%=mainUrl %>"/></td>
	</tr>
	<tr>
		<td ><jsp:include page="Inc/footer.jsp"/></td>
	</tr>
</table>
</body>
</html>