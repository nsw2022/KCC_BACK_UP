package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UsersService {
	void execute(HttpServletRequest request, HttpServletResponse response);
}
