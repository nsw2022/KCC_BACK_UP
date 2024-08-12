package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.Product;

public interface ProductMapper {
	// 상품 목록을 조회하는 메소드
    List<Product> listProducts();
}
