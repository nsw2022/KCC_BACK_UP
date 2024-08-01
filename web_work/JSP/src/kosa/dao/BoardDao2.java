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
	
	// �⺻����
	public SqlSessionFactory getSqlSessionFactory() {
		// mybatis-config.xml =>
		String resource = "mybatis-config.xml";  // Ȯ���� .xml �߰�

		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	// ��ü��ȸ
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
	
	// ����ȸ
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
	
	
	// ������ ����
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
	
	//������ ����
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
