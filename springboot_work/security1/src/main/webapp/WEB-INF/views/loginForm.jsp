<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert title here</title>
</head>
<body>
<h1>로그인 홈페이지</h1>
<hr>
<form action="/login" method="post">
    <input type="text" name="username" placeholder="username">
    <br>
    <input type="password" name="password" placeholder="password">
    <br>
    <a href="/joinForm">회원가입</a>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" >
    <button>로그인</button>
</form>

</body>
</html>