<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>장바구니 과제</title>
    <link rel="stylesheet" href="/resources/shooping/style.css">
    <!-- 폰트어썸 -->
    <script src="https://kit.fontawesome.com/515785cd79.js" crossorigin="anonymous"></script>
    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery-3.7.1.js"
        integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>

</head>

<body>
    <header>
        <div id="logo">
            <a href="#"></a>
        </div>
    </header>

    <section class="contents-cart">
        <div class="cart-title-wrapper">
            <div>
                <i class="fa-solid fa-chevron-left fa-xl"></i>
                <h1 style="display: inline;">
                    장바구니
                </h1>
            </div>
            <section class="cart-title-layout"></section>
        </div>

        <div class="tabs-wrap">
            <div class="tabs">
                <span class="cartItemCount">일반구매</span>
                <a href="#" class="subscript-cart">정기배송</a>
            </div>
        </div>
        <div class="cart-list">
            <table>
                <tbody class="cart-list-body">
                ${cartItems }
                   <c:forEach items="${cartItems}" var="item">
                	      <tr>
                        <td>
                            <input type="checkbox" class="inputbox">
                            <a href="#"><img src="${item.imagePath}" alt="${item.productName}" width="140" height="140" /></a>
                        </td>
                        <td>
                            <div>
                                <a href="#" style="text-decoration: none; color: black;">${item.productName}</a>
                            </div>
                            <div>수량: <input type="number" value="${item.quantity}" min="1"></div>
                            <div>가격: <span class="price">${item.price}원</span></div>
                        </td>
                        <td><a href="#" class="cart-del"><span>삭제</span></a></td>
                    </tr>
                
                </c:forEach>
                    <tr>
                        <td colspan="5">
                            <span>로켓배송 상품</span>
                            <span class="cart-title-mini">
                                <span>무료배송</span>
                                19,800원 이상 주문 가능
                            </span>
                            <a href="#" class="cart-del"><span>삭제</span></a>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="checkbox" class="inputbox">
                            <a href="#"><img
                                    src="//thumbnail8.coupangcdn.com/thumbnails/remote/120x120ex/image/retail/images/429144738995624-c75eb373-41b4-4b12-a081-96d10719861e.jpg"
                                    alt="상품 이미지" width="140" height="140" /></a>
                        </td>
                        <td>
                            <div>
                                <a href="#" style="text-decoration: none; color: black;">헬로망치 대형 캣타워 1개</a>
                            </div>
                            <div>
                                수량: <input type="number" value="1" min="1">
                            </div>
                            <div>
                                가격: <span class="price">19,800원</span>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="5">
                            <span>로켓배송 상품</span>
                            <span class="cart-title-mini">
                                <span>무료배송</span>
                                19,800원 이상 주문 가능
                            </span>
                            <a href="#" class="cart-del"><span>삭제</span></a>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="checkbox" class="inputbox">
                            <a href="#"><img
                                    src="//thumbnail7.coupangcdn.com/thumbnails/remote/120x120ex/image/vendor_inventory/013e/2355a8268c76e9bd5ba4d737f31cd751f3a966e20ebb43da2f3a9d99fb70.jpg"
                                    alt="상품 이미지" width="140" height="140" /></a>
                        </td>
                        <td>
                            <div>
                                <a href="#" style="text-decoration: none; color: black;">삼텐바이미 이동식 tv 거치대</a>
                            </div>
                            <div>
                                수량: <input type="number" value="1" min="1">
                            </div>
                            <div>
                                가격: <span class="price">100,000원</span>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="5">
                            <span>로켓배송 상품</span>
                            <span class="cart-title-mini">
                                <span>무료배송</span>
                                19,800원 이상 주문 가능
                            </span>
                            <a href="#" class="cart-del"><span>삭제</span></a>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="checkbox" class="inputbox">
                            <a href="#"><img
                                    src="//thumbnail8.coupangcdn.com/thumbnails/remote/120x120ex/image/retail/images/1570834193410715-347ce053-3aa1-4bb8-a83e-11f9b87ced6a.jpg"
                                    alt="상품 이미지" width="140" height="140" /></a>
                        </td>
                        <td>
                            <div>
                                <a href="#" style="text-decoration: none; color: black;">필립스 노이즈 캔슬링</a>
                            </div>
                            <div>
                                수량: <input type="number" value="1" min="1">
                            </div>
                            <div>
                                가격: <span class="price">30,000</span>
                            </div>
                        </td>
                    </tr>
                </tbody>
            </table>
            <div class="cart-total-price">
                <h3>주문 예상 금액</h3>
                <div style="display: flex;justify-content: space-between;">
                    <div>총 상품 가격</div>
                    <div id="total-price">0원</div>
                </div>
                <div style="display: flex;justify-content: space-between;">
                    <div>총 할인 가격(2개당 2%)</div>
                    <div id="total-count">0원</div>
                </div>
                <hr>
                <div style="padding-bottom: 20px;text-align: right;" id="pay-price">0원</div>

                <button id="total-button">구매하기 (0)</button>


            </div>
        </div>
    </section>
    <script src="/resources/shooping/gogoShoping.js"></script>
</body>

</html>