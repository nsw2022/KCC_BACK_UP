package kosa.dao;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kosa.mapper.BoardMapper;
import kosa.model.Board;
import kosa.model.Search;

public class BoardDao2 {
	private static BoardDao2 dao = new BoardDao2();
	
	public static BoardDao2 getInstance() {
		return dao;
	}
	
	// 기본설정
	public SqlSessionFactory getSqlSessionFactory() {
		// mybatis-config.xml =>
		String resource = "mybatis-config.xml";  // 확장자 .xml 추가

		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	// 전체조회
	public List<Board> listBoard(Map	map) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Board> list = null;
		try {
			list = sqlSession.getMapper(BoardMapper.class).listBoard(map);
			//list = sqlSession.selectList("kosa.mapper.BoardMapper.listBoard");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
				
		return list;
	}
	
	// 상세조회
	public Board detailBoard(int seq) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Board board = null;
		
		try {
			board = sqlSession.getMapper(BoardMapper.class).detailBoard(seq);
		} catch (Exception e) {
		
		}if (sqlSession != null) {
			sqlSession.close();
		}
		return board;
	}
	
	
	// 데이터 삽입
	public int insertBoard(Board board) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = sqlSession.getMapper(BoardMapper.class).insertBoard(board);
			if(re>0) {
				sqlSession.commit(); 
			}else {
				sqlSession.rollback();
			}
				
		} catch (Exception e) {
 
		}if (sqlSession != null) {
			sqlSession.close();
		}
		
		return re;
	}
	
	//데이터 수정
	public int modiffy(Board board) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = sqlSession.getMapper(BoardMapper.class).modiffy(board);
			if(re>0) {
				sqlSession.commit(); 
			}else {
				sqlSession.rollback();
			}
				
		} catch (Exception e) {
 
		}if (sqlSession != null) {
			sqlSession.close();
		}
		
		return re;
		
	}
}
