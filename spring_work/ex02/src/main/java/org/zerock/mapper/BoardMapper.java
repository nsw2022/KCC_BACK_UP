package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
	// 전체 조회
	public List<BoardVO> getList();
	
	// 데이터 삽입
	public void insert(BoardVO board);
	
	// seq 값 얻어오기
	public int insertSelectKey(BoardVO board);
	
	// 상세보기
	public BoardVO read(Long bno);
	
	// 삭제
	public int delete(Long bno);
	
	// 수정
	public int update(BoardVO board);
	
}
