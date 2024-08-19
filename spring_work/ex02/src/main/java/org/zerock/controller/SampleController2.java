package org.zerock.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;
import org.zerock.domain.Ticket;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/sample2/*")
@Log4j
public class SampleController2 {
    
	  @GetMapping("/all")
	  public void doAll() {
	    
	    log.info("do all can access everybody");
	  }
	  
	  @GetMapping("/member")
	  public void doMember() {
	    
	    log.info("member");
	  }
	  
	  @GetMapping("/admin")
	  public void doAdmin() {
	    
	    log.info("admin");
	  }  
}