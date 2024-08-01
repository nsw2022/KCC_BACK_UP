<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="kosa.model.Search"%>
<%@page import="kosa.model.Board"%>
<%@page import="java.util.List"%>
<%@page import="kosa.dao.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	/* Search search = new Search();
	search.setArea(request.getParameterValues("area"));
	search.setSearchKey("%" + request.getParameter("searchKey") + "%"); */

	Map map = new HashMap();
	map.put("area",request.getParameterValues("area"));
	map.put("searchKey", "%" + request.getParameter("searchKey") + "%");
	
	BoardDao2 dao = BoardDao2.getInstance();
	List<Board> list = dao.listBoard(map);
	//System.out.println(list);
%>


<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>글목록</h3>
	<a href="/board/insert_form.jsp">글쓰기</a>
	<table border="1" width="800px">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<% for(int i=0; i<list.size();i++) {
			Board board = list.get(i);
		%>
		
		<tr>
			<td><%= board.getSeq() %></td>
			<td><a href="detail.jsp?seq=<%= board.getSeq() %>">
				<%= board.getTitle() %></a>
			</td>
			<td><%= board.getWriter() %></td>
			<td><%= board.getRegdate() %></td>
			<td><%= board.getHitcount() %></td>
		</tr>
		
		<% } %>
	</table>
	
	<br /><br />
	<form action="list.jsp" method="get">
		<input type="checkbox" name="area" value="title" /> 제목
		<input type="checkbox" name="area" value="writer" /> 작성자
		<input type="text" name="searchKey" size="10" placeholder="검색"/>
		<input type="submit" value="검색" /> 
	</form>
</body>
</html>