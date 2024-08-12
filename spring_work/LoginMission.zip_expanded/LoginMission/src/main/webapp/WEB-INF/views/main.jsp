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
	<h1>�ȳ��ϼ���! ��ǰ ��� �������Դϴ�.</h1>
	<%-- ${sessionScope } --%>

	<c:choose>
		<c:when test="${not empty sessionScope.loggedInUser}">
			<span>${sessionScope.loggedInUser.userName} �� ȯ���մϴ�!</span>
			<a href="/user/logout">�α׾ƿ�</a>
		</c:when>
		<c:otherwise>
			<a href="/user/loginAndSignup">�α���/ȸ������</a>
		</c:otherwise>
	</c:choose>
	<a href="/shopping/cart">��ٱ��� ������</a>
	<div class="container">
		<h1 class="mt-5">��ǰ ���</h1>
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
							<p class="card-text">����: ${item.price}��</p>
							<!-- ���� ���� �Է� �ʵ� -->
							<input type="number" name="quantity" value="1" min="1" max="10">
							<!-- ��ٱ��� �߰� ��ư -->
							<button class="btn btn-secondary"
								onclick="addToCart('${item.productId}', this.previousElementSibling.value)"
								style="width: 64%; padding: 8px 12px;">��ٱ��� �߰�</button>
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
    // ������ �ε� �� ����

        // �����κ��� ���޹��� �˸� �޽����� �ִ��� �˻�
        <% if (request.getSession().getAttribute("alertMessage")!=null) { %>
            alert("<%= request.getSession().getAttribute("alertMessage") %>");
            request.getSession().removeAttribute("alertMessage"); // �޽��� ǥ�� �� ���ǿ��� ����
        <% } %>

</script>
</body>
</html>