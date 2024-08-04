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
        // 요청 URI에서 서비스 문자열을 추출합니다.
        String serviceStr = request.getRequestURI().substring((request.getContextPath() + "/users/").length());

        System.out.println(serviceStr + "  users에있습?");
        
        // UTF-8로 문자 인코딩 설정
        request.setCharacterEncoding("utf-8");

        // 페이지 이동을 위한 메인 페이지 속성 설정
        request.setAttribute("mainPage", "users/" + serviceStr);

        // 페이지 데이터 객체 설정
        request.setAttribute("pd", new PageData(request));

        try {
            // 서비스 클래스의 인스턴스를 동적으로 생성하고 실행
            UsersService service = (UsersService) Class.forName("ser_p." + serviceStr).newInstance();
            service.execute(request, response);

            // JSP 파일로 요청을 전달(포워딩)
            
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
