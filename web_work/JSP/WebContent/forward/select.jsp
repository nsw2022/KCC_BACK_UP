<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="control.jsp" method="post">
	보고싶은 페이지
	<select name="page" id="selectPage">
		<option value="a.jsp">A</option>
		<option value="b.jsp">B</option>
		<option value="c.jsp">C</option>
	</select>
	<button type="submit">전송</button>
</form>
</body>
</html>