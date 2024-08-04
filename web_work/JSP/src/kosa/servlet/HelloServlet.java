package kosa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/HelloServlet","/hello"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("오긴함?");
		
		out.write("<html><head><title>¤¾¤·</title></head>");
	
		out.write("<h1>Hello Servlet!!!</h1>");
		out.write("</body></html>");
		
		out.close();
	}

	

}