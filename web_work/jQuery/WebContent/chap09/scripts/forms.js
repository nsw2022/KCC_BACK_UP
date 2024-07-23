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
        let shippingCost = parseInt(totalQuantity / 2) * 1;
        let total = totalCost + tax + shippingCost; 

        $('.tax .cost').text('$' + tax.toFixed(2));
        $('.subtotal .cost').text('$' + totalCost.toFixed(2));
        $('.shipping .cost').text('$' + shippingCost + '.00');
        $('.shipping .quantity').text(totalQuantity);
        $('.total .cost').text('$' + total.toFixed(2)); 
    });
});
