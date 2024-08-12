package org.zerock.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.UserVO;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//스프링 컨테이너 생성
@Log4j //로그 보이게하기
public class UserMapperTest {
	
	@Autowired
	UserMapper mapper;

//	@Test
//	public void checkuid() {
//		log.info(mapper.countUserId("user1234"));
//	}
	
//	@Test
//	public void addUser() {
//	    UserVO userVO = new UserVO();
//	    userVO.setUserId("user1113");
//	    userVO.setUserName("테스투");
//	    userVO.setUserPass("1234");
//	    userVO.setUserEmail("aaa@naver.com");
//
//	    int result = mapper.insertUser(userVO); 
//	    log.info("Number of rows inserted: " + result); 
//	}
	
	@Test
	public void login() {
		
		log.info(mapper.login("tmddn3410", "!A12345678"));
	}


	

}
