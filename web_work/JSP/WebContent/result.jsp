<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결과출력</h1>
	<%-- 결과 : <b>${result}</b>
	이름 : <b>${name}</b> --%>
	<p><strong>이름:</strong> ${username }</p>
    <p><strong>이메일:</strong> ${email }</p>
    <p><strong>비밀번호:</strong>${password }</p>
    <p><strong>선택된 취미:</strong> ${hobbies }</p>
</body>
</html>