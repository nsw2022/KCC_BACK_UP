package org.zerock.sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//스프링 컨테이너 생성
@Log4j //로그 보이게하기
public class SampleTests {

	
	/*
	 * 객체가 만들어졌는지의 여부는 스프링컨테이너에 가보면된다
	 * 스프링컨테이너는 가져오려면 어떻게 해야할가?
	 * 스프링 컨텍스트를 가져와서 설정된 정보도 가져와야한다.
	 */
	
	@Autowired
	private Restaurant restaurant;
	
	@Test
	public void test() {
		assertNotNull(restaurant);
		log.info(restaurant);
		log.info(restaurant.getChef());
	}

}
