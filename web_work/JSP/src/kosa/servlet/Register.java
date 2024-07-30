package kosa.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Register() {
        super();
      
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		 // 입력 데이터 받기
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String[] hobbies = request.getParameterValues("hobbies"); // 취미는 여러 개 선택될 수 있으므로 배열로 받음

        // request 객체에 데이터 저장
        request.setAttribute("username", username);
        request.setAttribute("email", email);
        request.setAttribute("password", password);
        request.setAttribute("hobbies", hobbies != null ? Arrays.toString(hobbies) : "선택된 취미 없음");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
        dispatcher.forward(request, response);
	}

}
