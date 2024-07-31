<%@page import="kosa.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
   
<%
	request.setCharacterEncoding("UTF-8");
	
%>
<jsp:useBean id="member" class="kosa.member.Member" />
<jsp:setProperty property="*" name="member"/>

<%
	MemberDao dao = MemberDao.getInstance();
	dao.insert(member);
	
%>

<body>
	<h1>결과출력</h1>
	<%-- 결과 : <b>${result}</b>
	이름 : <b>${name}</b> --%>
	<p><strong>이름:</strong> ${member.username }</p>
    <p><strong>이메일:</strong> ${member.email }</p>
    <p><strong>비밀번호:</strong>${member.password }</p>
    <p><strong>선택된 취미:</strong> ${member.hobbies }</p>
</body>
</html>