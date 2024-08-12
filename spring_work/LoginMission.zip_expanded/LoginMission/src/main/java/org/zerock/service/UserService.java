package org.zerock.service;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.UserVO;

public interface UserService {

	// 아이디 중복 검사
	boolean checkUserId(String userId);

	// 회원 추가
	boolean insertUser(UserVO user);

	// 로그인
	UserVO login(@Param("userId") String userId, @Param("userPass") String userPass);
}
