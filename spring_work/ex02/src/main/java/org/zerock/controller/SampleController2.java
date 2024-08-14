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
@RequestMapping("/sample2")
@Log4j
public class SampleController2 {
    
    @GetMapping("/all")
    public String doAll() {
        log.info("all access");
        return "Access to all users";
    }
    
    @GetMapping("/member")
    public String doMember() {
        log.info("member");
        return "Access to member";
    }
    
    @GetMapping("/admin")
    public String doAdmin() {
        log.info("admin");
        return "Access to admin";
    }
}