$(function() {
    $('.quantity input').change(function() {
        let totalCost = 0;
        let totalQuantity = 0;
        
        $('table tbody tr').each(function(index) {
            let price = parseFloat($(this).find('.price').text().replace(/[^0-9.]+/g, ''));
            price = isNaN(price) ? 0 : price;
            
            let quantity = parseInt($(this).find('.quantity input').val());
            quantity = isNaN(quantity) ? 0 : quantity;
            
            let cost = price * quantity;
            $(this).find('.cost').text('$' + cost.toFixed(2));
            
            totalCost += cost;
            totalQuantity += quantity;
        });

        let tax = totalCost * 0.06;
        let shippingCost = parseInt(totalQuantity / 2) * 1; // 배송 비용 계산 (예: 각 2개 당 1달러)
        let total = totalCost + tax + shippingCost; // 총합 계산

        $('.tax .cost').text('$' + tax.toFixed(2));
        $('.subtotal .cost').text('$' + totalCost.toFixed(2));
        $('.shipping .cost').text('$' + shippingCost + '.00');
        $('.shipping .quantity').text(totalQuantity);
        $('.total .cost').text('$' + total.toFixed(2)); // 총합을 문자열로 변환하여 출력
    });
});
