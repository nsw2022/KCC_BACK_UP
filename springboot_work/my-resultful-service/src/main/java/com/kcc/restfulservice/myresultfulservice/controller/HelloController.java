package com.kcc.restfulservice.myresultfulservice.controller;

import com.kcc.restfulservice.myresultfulservice.bean.HelloWorldBeans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public String helloWorldBean() {
        return new HelloWorldBeans("Hello World Bean!!").toString();
    }

    @GetMapping("/hello-world-bean/{name}")
    public String helloWorldBean(@PathVariable String name) {
        return new HelloWorldBeans(String.format("Hello World Bean: %s", name)).toString();
    }

    @GetMapping("/hello-word-international")
    public String helloWordInternational(
            @RequestHeader(name = "Accept-Language", required = false) Locale locale
    ) {
        return messageSource.getMessage("greeting.message",null,locale);
    }
}
