<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<%
    request.setCharacterEncoding("utf-8");
    String product = request.getParameter("product");
    List<String> productList = (List<String>) session.getAttribute("productList");
    if (productList == null) {
        productList = new ArrayList<String>();
        session.setAttribute("productList", productList);
    }
    if (product != null && !product.isEmpty()) {
        productList.add(product);
    }
    System.out.println(Arrays.toString(productList.toArray()));
        	
    
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="javascript:history.back()">뒤로가기</a>
	<%=product %>
</body>
</html>