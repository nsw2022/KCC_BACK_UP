package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.BoardDAO;

public class BList implements BoardService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle", "�Խ��Ǹ��");
		System.out.println("BList.execute ����");

//		ArrayList<BoardDTO> mainData = new BoardDAO().list();
//		System.out.println(mainData);
//		
		request.setAttribute("mainData", new BoardDAO().listBoard());
		
	}

}
