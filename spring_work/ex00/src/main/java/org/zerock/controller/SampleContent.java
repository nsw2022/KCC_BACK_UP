package org.zerock.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleContent {
	@GetMapping("basic")
	public void basicGet() {

		log.info("basic...........");
	}

	@GetMapping("ex01")
	public String ex01(SampleDTO dto) {

		log.info("ex01...........");
		log.info("dto: " + dto);

		return "ex01";
	}

	@GetMapping("ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {

		log.info("이름: " + name);
		log.info("나이: " + age);

		return "ex02";
	}

	@GetMapping("ex03")
	public String ex03(RedirectAttributes rttr) {

		rttr.addAttribute("name", "bbb");
		rttr.addAttribute("age", 30);
		rttr.addAttribute("page", "100");

		return "redirect:/sample/ex04";
	}

	@GetMapping("ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {

		log.info("ex04...........");
		log.info("dto: " + dto);

		return "ex04";
	}

	@GetMapping("ex05")
	public void ex05() {
		log.info("ex05");

	}

	@GetMapping("ex06")
	public @ResponseBody SampleDTO ex06() {
		SampleDTO dto = new SampleDTO();
		dto.setName("홍길동");
		dto.setAge(20);

		return dto;
	}

	@GetMapping("ex07")
	public ResponseEntity<String> ex07() {
		log.info("ex07....");

		// {"name":"홍길동"}
		//String message = "{\"name\":\"홍길동\"}";
		Map<String, String>msssage = new HashMap<String, String>();
		msssage.put("name","홍길동");
		msssage.put("age","20");

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json;charset=UTF-8");

		return new ResponseEntity(msssage, headers, HttpStatus.OK);
	}
	
	
	//void로 exUpload 출력
	@GetMapping("exUpload")
	public void exUpload() {
		log.info("exUpload");
	}
	
	@PostMapping("exUploadPost")
	public void exUploadPost(List<MultipartFile> files) {
		// file 을 받아와도 
		files.forEach(file->{
			log.info("-----------------");
			log.info("name: " + file.getOriginalFilename());
			log.info("size: " + file.getSize());
			
		});
	}

}
