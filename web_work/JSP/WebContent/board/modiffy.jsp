<%@page import="kosa.dao.BoardDao2"%>
<%@page import="kosa.model.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	int seq = Integer.parseInt(request.getParameter("seq"));
	BoardDao2 dao = BoardDao2.getInstance();
	Board board = dao.detailBoard(seq);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>
<body>
    <h3>글 수정하기</h3>
    <hr>
    <form action="modifyAction.jsp" method="post">
        작성자: <input type="text" name="writer" value="<%= board.getWriter() %>" ><br>
        제목: <input type="text" name="title" value="<%= board.getTitle() %>"><br>
        내용:<br>
        <textarea rows="6" cols="70" name="contents"><%= board.getContents() %></textarea>
        <br>
        <input type="hidden" name="seq" value="<%= board.getSeq() %>">
        <input type="submit" value="수정하기">
    </form>
</body>
</html>
