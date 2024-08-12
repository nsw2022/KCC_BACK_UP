package org.zerock.shopping;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/shopping")
public class ShopController {

	@GetMapping("/cart")
	public String cart(HttpSession session, Model model) {
		  if (session.getAttribute("loggedInUser") == null) {
	            model.addAttribute("message", "로그인이 필요한 서비스입니다.");
	            model.addAttribute("redirectUrl", "/main");
	            return "PageData"; // 중간 페이지의 뷰 이름
	        }
		return "/shopping/cart";
	}

}
