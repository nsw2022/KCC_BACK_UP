package kosa.mapper;

import java.util.List;
import java.util.Map;

import kosa.model.Board;
import kosa.model.Search;

public interface BoardMapper {
	
	// ��ü��ȸ
	List<Board> listBoard(Map map);
	
	// �󼼺���
	Board detailBoard(int seq);
	
	// ������ ����
	int insertBoard(Board board);
	
	// ������ ����
	int modiffy(Board board);

}
