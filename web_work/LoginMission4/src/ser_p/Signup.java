package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.UsersService;

public class Signup implements UsersService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","ȸ������");
		System.out.println("ȸ�������� �̵�");
		/*
		 * request.setAttribute("mainPage", "alert");
		 * request.setAttribute("msg","ȯ���մϴ�."); request.setAttribute("goUrl",
		 * "users/Signup");
		 */
		
	}

}
