package org.zerock.service;

import java.util.List;

import org.zerock.domain.Product;

public interface ProductService {
	// 상품 목록을 조회하는 메소드
    List<Product> listProducts();
}
