package org.zerock.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.UserVO;
import org.zerock.mapper.UserMapper;
import org.zerock.service.UserService;

@Controller
@RequestMapping("/user/*")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/loginAndSignup")
	public void login() {

	}

	@PostMapping("/checkuid")
	public void checkUserId(@RequestParam("uid") String uid, HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		boolean exists = userService.checkUserId(uid);

		if (exists) {
			response.getWriter().write("{\"message\": \"이미 존재하는 사용자 ID입니다.\", \"success\": false}");
		} else {
			response.getWriter().write("{\"message\": \"사용 가능한 사용자 ID입니다.\", \"success\": true}");
		}
	}

	@PostMapping("/adduser")
	public String addUser(@ModelAttribute UserVO userVO, Model model) {
		try {
			System.out.println("#########  시점 UserController  ###########");
			System.out.println(userVO);
			boolean result = userService.insertUser(userVO);
			if (result) {
				model.addAttribute("message", "회원가입을 축하합니다!");
			} else {
				model.addAttribute("message", "회원가입 실패: 유효한 데이터를 입력해주세요.");
			}
		} catch (Exception e) {
			model.addAttribute("message", "서버 오류로 회원가입에 실패했습니다.");
		}
		return "/user/loginAndSignup"; // 뷰의 이름 반환
	}

	@PostMapping("/login")
	public void login(@RequestParam("userId") String userId,
	                  @RequestParam("userPass") String userPass,
	                  HttpSession session,
	                  HttpServletResponse response) throws IOException {
	    System.out.println("#########  시점 login  ###########");
	    
	    // 응답의 Content-Type과 캐릭터 인코딩 설정
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");

	    // 로그인 처리
	    UserVO user = userService.login(userId, userPass);
	    System.out.println(user);

	    // JSON 응답 작성
	    if (user != null) {
	        session.setAttribute("loggedInUser", user);
	        response.getWriter().write("{\"success\": true, \"message\": \"로그인 성공\", \"redirectTo\": \"/\"}");
	    } else {
	        response.getWriter().write("{\"success\": false, \"message\": \"아이디 혹은 비밀번호를 잘못 입력하셨습니다.\"}");
	    }
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate();  // 세션 전체를 무효화
	    // 또는 session.removeAttribute("user");  // user만 세션에서 제거
	    return "redirect:/";  // 홈페이지나 로그인 페이지로 리다이렉트
	}


}
