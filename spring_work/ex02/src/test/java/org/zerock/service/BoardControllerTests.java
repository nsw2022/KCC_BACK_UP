package org.zerock.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml","file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
//스프링 컨테이너 생성
@Log4j //로그 보이게하기
public class BoardControllerTests {
	
//	@Autowired
//	private WebApplicationContext ctx;
//	private MockMvc mockMvc;
//	
//	@Before
//	public void setUp() {
//		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
//	}
//	
//	@Test
//	public void test()  throws Exception {
//		log.info(
//					mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
//					.andReturn()
//					.getModelAndView()
//					.getModelMap()
//					
//				);
//	}

}
