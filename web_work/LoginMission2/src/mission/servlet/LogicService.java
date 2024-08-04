package mission.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LogicService {
	void execute(HttpServletRequest request, HttpServletResponse response);
}
