package kosa.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalsServlet")
public class CalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalsServlet() {
		super();

	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String name = request.getParameter("name");
		
		int result = num1 + num2;
		request.setAttribute("result", result);
		request.setAttribute("name", name);
		
		//�������̵�
		// 1.Dispatcher : ���� ��û�� ���弱(1���� request)
		RequestDispatcher re = request.getRequestDispatcher("/result.jsp");
		re.forward(request, response);
		
		// 2. Redirect : ������û�� �ٸ� ���ο� ��û���� �̵�
		//response.sendRedirect("result.jsp");
	}

}
