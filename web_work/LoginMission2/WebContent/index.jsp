<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<%
    request.setCharacterEncoding("utf-8");
    UserDao
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ㅎㅇ</h1>
	<a href="/login">로그인</a>
	<a href="/user/siginup">회원가입</a>
	<a href="/board/BList">게시판</a>
	<h1>사용자 목록</h1>
	<table border="1">
		<tr>
			<th>사용자 ID</th>
			<th>이메일</th>
			<th>이름</th>
			<th>가입 날짜</th>
		</tr>
		<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.userId}</td>
				<td>${user.email}</td>
				<td>${user.fullName}</td>
				<td>${user.registeredDate}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>