package mission.mapper;

import java.util.List;

import mission.model.User;

public interface UserMapper {
	
	// 전체조회
	List<User> listUser();
	
	// 데이터 삽입
	void insertUser(User user);
}
