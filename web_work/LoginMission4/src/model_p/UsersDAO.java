package model_p;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import mapper.UsersMapper;

public class UsersDAO {
	public static UsersDAO dao = new UsersDAO();
	
	public static UsersDAO getInstance() {
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
	
	
	public int insertUsers(String userId, String password, String email, String name) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			  UsersDTO user = new UsersDTO(userId, password, email, name);
			re = sqlSession.getMapper(UsersMapper.class).insertUsers(user);
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
