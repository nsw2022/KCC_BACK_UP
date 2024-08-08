package org.zerock.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapperTests;

import lombok.val;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//스프링 컨테이너 생성
@Log4j //로그 보이게하기
public class BoardServiceTests {
	
	@Autowired
	private BoardService service;

//	@Test
//	public void test() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로운 글4");
//		board.setTitle("새로운 글내용4");
//		board.setContent("새로운 글내용");
//		board.setWriter("user01");
//		service.register(board);
//		log.info("글번호 : " + board.getBno());
//	}
	
//	@Test	
//	public void testGetList(){
//		service.getList().forEach(board-> log.info(board));
//	}
	
//	@Test
//	public void testGet() {
//		log.info(service.get(4L));
//	}
	
	
//	@Test
//	public void testUdate() {
//		BoardVO board = service.get(4L);
//		if(board==null) return;
//		board.setTitle("제목을 수정스");
//		log.info("modify result " + service.modify(board));
//	}
	
//	@Test
//	public void testDelete() {
//		log.info( "result delete: " + service.remove(4L));
//	}

}
