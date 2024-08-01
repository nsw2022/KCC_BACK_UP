package kosa.mapper;

import java.util.List;
import java.util.Map;

import kosa.model.Board;
import kosa.model.Search;

public interface BoardMapper {
	
	// 전체조회
	List<Board> listBoard(Map map);
	
	// 상세보기
	Board detailBoard(int seq);
	
	// 데이터 삽입
	int insertBoard(Board board);
	
	// 데이터 수정
	int modiffy(Board board);

}
