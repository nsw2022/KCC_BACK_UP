<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>선택하신 상품 목록</title>
</head>
<body>
    <h1>선택하신 상품 목록</h1>
    <% List<String> productList = (List<String>) session.getAttribute("productList"); %>
    <c:choose>
        <c:when test="${not empty productList}">
            <c:forEach var="item" items="${productList}">
                <p>${item}</p>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <p>선택된 상품이 없습니다.</p>
        </c:otherwise>
    </c:choose>
    <% session.invalidate(); %>
    <a href="login.jsp">다시하기</a>
</body>
</html>
