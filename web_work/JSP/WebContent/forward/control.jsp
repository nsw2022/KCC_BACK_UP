<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
	String selectPage = request.getParameter("page");
	if(selectPage==null||selectPage.isEmpty()) selectPage="select.jsp";
	request.getRequestDispatcher(selectPage).forward(request, response);
%>
