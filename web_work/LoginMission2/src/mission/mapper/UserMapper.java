package mission.mapper;

import java.util.List;

import mission.model.User;

public interface UserMapper {
	
	// ��ü��ȸ
	List<User> listUser();
	
	// ������ ����
	void insertUser(User user);
}
