package org.zerock.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//스프링 컨테이너 생성
@Log4j // 로그 보이게하기
public class SampleTxServiceTests {

	@Autowired
	private SampleTxService service;

	@Test
	public void test() {
		StringBuilder sb = new StringBuilder(); // StringBuilder 인스턴스 생성

		for (int i = 0; i < 51; i++) { // 51번 반복
			sb.append("a"); // StringBuilder에 'a' 추가
		}

		String result = sb.toString();
		service.addData(result);
	}

}
