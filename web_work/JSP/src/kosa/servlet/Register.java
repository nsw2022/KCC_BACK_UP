package kosa.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosa.dao.MemberDao;
import kosa.member.Member;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Register() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
//		
//		 // �Է� ������ �ޱ�
//        String username = request.getParameter("username");
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//        String[] hobbies = request.getParameterValues("hobbies"); 
//
//        // request ��ü�� ������ ����
//        request.setAttribute("username", username);
//        request.setAttribute("email", email);
//        request.setAttribute("password", password);
//        request.setAttribute("hobbies", hobbies != null ? Arrays.toString(hobbies) : "���õ� ��� ����");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
//        dispatcher.forward(request, response);

//		String username = request.getParameter("username");
//		String email = request.getParameter("email");
//		String password = request.getParameter("password");
//		String[] hobbies = request.getParameterValues("hobbies");
//		String hobbiesAsString = hobbies != null ? String.join(", ", hobbies) : "���õ� ��� ����";
//
//		Member member = new Member(username, email, password, hobbiesAsString);
//		MemberDao dao = MemberDao.getInstance();
//		dao.insert(member);
//
//		request.setAttribute("member", member);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
//		dispatcher.forward(request, response);
	}

}
