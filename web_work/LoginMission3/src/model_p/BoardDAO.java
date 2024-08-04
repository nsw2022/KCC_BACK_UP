package model_p;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mapper.BoardMapper;



public class BoardDAO {
	
	public static BoardDAO dao = new BoardDAO(); 
	
	public static BoardDAO getInstance() {
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
		public List<BoardDTO> listBoard() {
			SqlSession sqlSession = getSqlSessionFactory().openSession();
			List<BoardDTO> list = null;
			try {
				//list = sqlSession.getMapper(BoardMapper.class).listBoard(map);
				//list = sqlSession.selectList("kosa.mapper.BoardMapper.listBoard");
				
				list = sqlSession.getMapper(BoardMapper.class).listBoard();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if (sqlSession != null) {
					sqlSession.close();
				}
			}
					
			return list;
		}
	
}
