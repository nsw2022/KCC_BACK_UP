<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>회원 가입</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>회원 가입</h1>
    <form action="UserRegister" method="post">
        <div>
            <label for="userId">사용자 ID:</label>
            <input type="text" id="userId" name="userId" required>
        </div>
        <div>
            <label for="password">비밀번호:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div>
            <label for="email">이메일:</label>
            <input type="email" id="email" name="email">
        </div>
        <div>
            <label for="fullName">전체 이름:</label>
            <input type="text" id="fullName" name="fullName">
        </div>
        <div>
            <button type="submit">회원 가입</button>
        </div>
    </form>
</body>
</html>
