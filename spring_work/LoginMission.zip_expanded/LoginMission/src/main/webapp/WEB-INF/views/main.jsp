<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">


</head>
<body>
	<h1>안녕하세요! 상품 목록 페이지입니다.</h1>
	<%-- ${sessionScope } --%>

	<c:choose>
		<c:when test="${not empty sessionScope.loggedInUser}">
			<span>${sessionScope.loggedInUser.userName} 님 환영합니다!</span>
			<a href="/user/logout">로그아웃</a>
		</c:when>
		<c:otherwise>
			<a href="/user/loginAndSignup">로그인/회원가입</a>
		</c:otherwise>
	</c:choose>
	<a href="/shopping/cart">장바구니 페이지</a>
	<div class="container">
		<h1 class="mt-5">상품 목록</h1>
		<div class="row">
			<%-- <h1>products</h1>
		<p>${products }</p> --%>
			<c:forEach var="item" items="${products}">
				<div class="col-md-3">
					<div class="card mb-4">
						<img class="card-img-top" src="${item.imagePath}"
							alt="${item.productName}" style="height: 253px">
						<div class="card-body">
							<h5 class="card-title">${item.productName}</h5>
							<p class="card-text">가격: ${item.price}원</p>
							<!-- 수량 선택 입력 필드 -->
							<input type="number" name="quantity" value="1" min="1" max="10">
							<!-- 장바구니 추가 버튼 -->
							<button class="btn btn-secondary"
								onclick="addToCart('${item.productId}', this.previousElementSibling.value)"
								style="width: 64%; padding: 8px 12px;">장바구니 추가</button>
						</div>
					</div>
				</div>
			</c:forEach>

		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		<script>
    // 페이지 로드 시 실행

        // 서버로부터 전달받은 알림 메시지가 있는지 검사
        <% if (request.getSession().getAttribute("alertMessage")!=null) { %>
            alert("<%= request.getSession().getAttribute("alertMessage") %>");
            request.getSession().removeAttribute("alertMessage"); // 메시지 표시 후 세션에서 제거
        <% } %>

</script>
</body>
</html>