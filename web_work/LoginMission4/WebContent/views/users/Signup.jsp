<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
</head>
<body>
    <h2>회원가입</h2>
    <form action="/users/UserService" method="post">

        아이디: <input type="text" name="user_id" required><br>
        비밀번호: <input type="password" name="password" required><br>
        이메일: <input type="email" name="email"><br>
        이름: <input type="text" name="p_name"><br>
        <button type="submit">가입하기</button>
    </form>
</body>
</html>
