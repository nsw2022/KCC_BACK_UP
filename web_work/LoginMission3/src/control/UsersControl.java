package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model_p.PageData;

@WebServlet("/users/*")
public class UsersControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UsersControl() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // ��û URI���� ���� ���ڿ��� �����մϴ�.
        String serviceStr = request.getRequestURI().substring((request.getContextPath() + "/users/").length());

        System.out.println(serviceStr + "  users���ֽ�?");
        
        // UTF-8�� ���� ���ڵ� ����
        request.setCharacterEncoding("utf-8");

        // ������ �̵��� ���� ���� ������ �Ӽ� ����
        request.setAttribute("mainPage", "users/" + serviceStr);

        // ������ ������ ��ü ����
        request.setAttribute("pd", new PageData(request));

        try {
            // ���� Ŭ������ �ν��Ͻ��� �������� �����ϰ� ����
            UsersService service = (UsersService) Class.forName("ser_p." + serviceStr).newInstance();
            service.execute(request, response);

            // JSP ���Ϸ� ��û�� ����(������)
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/views/template.jsp");

            dispatcher.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
