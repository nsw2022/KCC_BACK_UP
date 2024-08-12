package org.zerock.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;
import org.zerock.service.ReplyService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/replies/*")
@Log4j
@AllArgsConstructor
public class ReplyController {
	
	private ReplyService service;
	
	@PostMapping("/new")
	public ResponseEntity<String> create(@RequestBody ReplyVO vo){
		log.info("Reply VO: " + vo);
		int insertCount = service.register(vo);
		return insertCount == 1 
				? new ResponseEntity<String>("success",HttpStatus.OK)
				: new  ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	// 게시글의 댓글 조회
	@GetMapping("/pages/{bno}/{page}")
	public ResponseEntity<List<ReplyVO>> getList(
				@PathVariable("page") int page,
				@PathVariable("bno") Long bno){
		log.info("getList..............");
		Criteria cri = new Criteria(page, 10);
		
		return new ResponseEntity<List<ReplyVO>> (service.getList(cri, bno), HttpStatus.OK);
	}
	
	// 댓글하나 조회
	@GetMapping("{rno}")
	public ResponseEntity<ReplyVO> get(@PathVariable("rno") Long rno){
		log.info("get...........");
		return new ResponseEntity<ReplyVO>(service.get(rno), HttpStatus.OK);
	}
	
	@PutMapping("{rno}")
	public ResponseEntity<String> modify(
			@PathVariable("rno") Long rno,
			@RequestBody ReplyVO vo
			){
		vo.setRno(rno);
		return service.modify(vo)==1
				? new ResponseEntity<String>("success",HttpStatus.OK)
				: new  ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@DeleteMapping("{rno}")
	public ResponseEntity<String> remove(@PathVariable("rno") Long rno){
		return service.remove(rno)==1
				? new ResponseEntity<String>("success",HttpStatus.OK)
				: new  ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
