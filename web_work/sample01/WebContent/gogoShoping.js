
$(function () {
    // 체크박스와 수량 입력 필드의 변화 감지
    $('.inputbox, .cart-list-body input[type="number"]').change(function () {
        updateCartTotal();
    });

    function updateCartTotal() {
        let totalPrice = 0;
        let totalCount = 0;

        // 체크된 상품들의 수량과 가격을 기반으로 총액 계산
        $('.inputbox:checked').each(function () {
            const row = $(this).closest('tr');
            const quantity = parseInt(row.find('input[type="number"]').val());
            const price = parseInt(row.find('.price').text().replace(/[^0-9]+/g, ""));

            totalCount += quantity;
            totalPrice += price * quantity;
        });

        // 할인 계산 (2개 이상의 상품 구매 시 2% 할인)
        let discount = (totalCount >= 2) ? parseInt((Math.floor(totalCount / 2) * 0.02 * totalPrice)) : 0;

        // 총 상품 가격과 할인 가격 표시
        $('#total-price').text(totalPrice.toLocaleString() + '원');
        $('#total-count').text(discount.toLocaleString() + '원');

        // 최종 지불 금액 계산
        let finalAmount = totalPrice - discount;
        $('#pay-price').text(finalAmount.toLocaleString() + '원');

        // 구매 버튼의 텍스트 업데이트
        $('#total-button').text('구매하기 (' + totalCount + ')');
    }

})


