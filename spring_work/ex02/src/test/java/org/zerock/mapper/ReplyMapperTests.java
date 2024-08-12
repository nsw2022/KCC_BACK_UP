package org.zerock.mapper;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//스프링 컨테이너 생성
@Log4j //로그 보이게하기
public class ReplyMapperTests {
	
	@Autowired
	ReplyMapper mapper;
	
	private Long [] bnoArr = {6L,7L,9L,10L,11L}; 

//	@Test
//	public void test() {
//		log.info(mapper);
//	}
	
//	@Test
//	public void testCreate() {
//		IntStream.rangeClosed(1, 10).forEach(i ->{
//			ReplyVO vo = new ReplyVO();
//			vo.setBno(bnoArr[(i - 1) % 5]);
//			vo.setReply("댓글 테스트" + i);
//			vo.setReplyer("reply"+i);
//			
//			mapper.insert(vo);
//		});
//	}
	
//	@Test
//	public void testRead() {
//		Long target = 45L;
//		ReplyVO vo = mapper.read(target);
//		log.info(vo);
//	}
	
//	@Test
//	public void testDelete() {
//		Long target = 45L;
//		mapper.delete(target);
//		mapper.read(target);
//				
//	}
	
//	@Test
//	public void testUpdate() {
//		Long targetRno = 46L;
//		ReplyVO vo = mapper.read(targetRno);
//		vo.setReply("Update Reply...");
//		int count = mapper.update(vo);
//		log.info("update count..... " + count);
//	}
	
	@Test
	public void testList() {
		Criteria cri = new Criteria();
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[3]);
		replies.forEach(reply -> log.info(reply));
	}

}
