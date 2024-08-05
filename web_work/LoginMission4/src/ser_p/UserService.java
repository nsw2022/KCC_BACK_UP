package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.UsersDAO;

public class UserService implements BoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String userId = request.getParameter("user_id");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String name = request.getParameter("p_name");

		UsersDAO userDao = new UsersDAO();
		
		int result = userDao.insertUsers (userId, password, email, name);

		if (result > 0) {
			request.setAttribute("mainPage", "alert");
			request.setAttribute("msg", "사용자 등록 성공");
			request.setAttribute("goUrl", "/");
		} else {
			request.setAttribute("mainPage", "alert");
			request.setAttribute("msg", "사용자 등록 실패");
			request.setAttribute("goUrl", "Signup.jsp");
		}
	}

}
