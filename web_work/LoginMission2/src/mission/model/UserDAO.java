package mission.model;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mission.mapper.UserMapper;

public class UserDAO {
	private SqlSessionFactory sqlSessionFactory;

	public UserDAO(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public List<User> listUser() {
	    try (SqlSession session = sqlSessionFactory.openSession()) {
	        UserMapper mapper = session.getMapper(UserMapper.class);
	        return mapper.listUser();
	    }
	}


}
