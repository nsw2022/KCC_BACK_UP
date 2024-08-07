package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/q/*")
@Log4j
public class q {

	@GetMapping("/qwer")
	public void basicGet() {
		log.info("what?");
	}
}
