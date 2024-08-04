package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BoardControl")
public class BoardControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BoardControl() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// System.out.println(request.getRequestURI());
		// System.out.println(request.getContextPath()+"/board/");
		String serviceStr = request.getRequestURI().substring((request.getContextPath() + "/board/").length());
		System.out.println(serviceStr);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
