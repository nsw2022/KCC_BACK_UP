<%@page import="kosa.dao.BoardDao"%>
<%@page import="kosa.model.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");
%> 
<jsp:useBean id="board" class="kosa.model.Board"/><!-- Board board = new Board() -->
<jsp:setProperty property="*" name="board"/>  <!-- board.setTitle(request.getParameter("title"))  -->

 <%
 	BoardDao dao = BoardDao.getInstance();
 	int re = dao.insert(board);
 	if(re == 1){
 		response.sendRedirect("/board/list.jsp");
 	}else{
 		out.println("실패");
 	}
 %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>