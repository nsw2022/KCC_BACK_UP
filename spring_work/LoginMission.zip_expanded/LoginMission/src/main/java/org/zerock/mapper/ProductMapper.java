package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.Product;
import org.zerock.domain.ShoppingCartItem;

public interface ProductMapper {
	// 상품 목록을 조회하는 메소드
    List<Product> listProducts();
    
    // 유저 장바구니 
    List<ShoppingCartItem> listCartItems(String userId);
    
    // 유저 장바구니 추가
    void addToCart(ShoppingCartItem item);
    
    // 유저 장바구니 삭제
    void removeFromCart(Long cartId);
    
    // 유저 장바구니 수정
    void updateCartItem(ShoppingCartItem item);
}
