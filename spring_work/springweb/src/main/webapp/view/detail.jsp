<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>글 세부보기</h2>
	<ul>
		<li>${board.getSeq() }</li>
		<li>${board.getTitle() }</li>
		<li>${board.getWriter() }</li>
		<li>${board.getContents() }</li>
		
	</ul>
	
	<a href="/board/modiffy.jsp?seq=${ board.getSeq() }">수정</a>
</body>
</html>