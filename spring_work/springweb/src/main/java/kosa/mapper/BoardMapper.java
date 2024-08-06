package kosa.mapper;

import java.util.List;
import kosa.model.Board;


public interface BoardMapper {
	
	// 전체조회
	List<Board> listBoard();
	
	// 상세보기
	Board detailBoard(int seq);
	
	// 데이터 삽입
	int insertBoard(Board board);
	
	

}
