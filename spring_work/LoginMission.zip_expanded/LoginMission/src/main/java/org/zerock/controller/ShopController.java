package org.zerock.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.ShoppingCartItem;
import org.zerock.domain.UserVO;
import org.zerock.service.ProductService;

@Controller
@RequestMapping("/shopping")
public class ShopController {

	@Autowired
	private ProductService productService;

	@GetMapping("/cart")
	public String cart(HttpSession session, Model model) {
		 UserVO loggedInUser = (UserVO) session.getAttribute("loggedInUser");
		if (session.getAttribute("loggedInUser") == null) {
			model.addAttribute("message", "로그인이 필요한 서비스입니다.");
			model.addAttribute("redirectUrl", "/main");
			return "PageData"; // 중간 페이지의 뷰 이름
		}

		// 로그인된 사용자의 ID를 사용하여 장바구니 항목 조회
		List<ShoppingCartItem> cartItems = productService.listCartItems(loggedInUser.getUserId());
		model.addAttribute("cartItems", cartItems);
		return "/shopping/cart";
	}

}
