package org.zerock.mapper;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.UserVO;

public interface UserMapper {
	// 아이디 중복 검사
	int countUserId(String userId);
	
	// 회원 추가
	int insertUser(UserVO user);
	
	// 로그인
	UserVO login(@Param("userId") String userId, @Param("userPass") String userPass);
}
