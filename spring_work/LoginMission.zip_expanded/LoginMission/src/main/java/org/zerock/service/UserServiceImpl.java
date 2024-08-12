package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.UserVO;
import org.zerock.mapper.UserMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@AllArgsConstructor
@Log4j
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean checkUserId(String userId) {
		log.info("checkUserId................");
		return userMapper.countUserId(userId) > 0;
	}

	@Override
	public boolean insertUser(UserVO user) {
		log.info("insertUser................");
		return userMapper.insertUser(user) > 0;
	}

	@Override
	public UserVO login(String userId, String userPass) {
		return userMapper.login(userId, userPass);
	}

	

}
