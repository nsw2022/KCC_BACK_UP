package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.UsersService;

public class Signup implements UsersService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","회원가입");
		System.out.println("회원가입폼 이동");
		/*
		 * request.setAttribute("mainPage", "alert");
		 * request.setAttribute("msg","환영합니다."); request.setAttribute("goUrl",
		 * "users/Signup");
		 */
		
	}

}
