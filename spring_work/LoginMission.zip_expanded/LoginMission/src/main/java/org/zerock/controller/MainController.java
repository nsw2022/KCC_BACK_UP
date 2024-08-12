package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.Product;
import org.zerock.service.ProductService;

@Controller
@RequestMapping("/main")
public class MainController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("")
	public String main(Model model) {
		List<Product> list = productService.listProducts();
		
		model.addAttribute("products",list);
		
		return "main";
	}
	
}
