package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.Product;
import org.zerock.mapper.ProductMapper;
import org.zerock.mapper.UserMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@AllArgsConstructor
@Log4j
public class ProductServiceImple implements ProductService{

	@Autowired
	ProductMapper productMapper;
	
	@Override
	public List<Product> listProducts() {
		log.info("상품리스트 소환.......");
		return productMapper.listProducts();
	}

}
