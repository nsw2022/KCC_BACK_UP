package kosa.mapper;

import java.util.List;
import kosa.model.Board;


public interface BoardMapper {
	
	// ��ü��ȸ
	List<Board> listBoard();
	
	// �󼼺���
	Board detailBoard(int seq);
	
	// ������ ����
	int insertBoard(Board board);
	
	

}
