package com.kcc.security1.controller;

import com.kcc.security1.repository.UserRepository;
import com.kcc.security1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private UserRepository repository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping({"","/"})
    public String index(){
        return "index";
    }

    @GetMapping("/common")
    public @ResponseBody String common (){
        return "common";
    }

    @GetMapping("/user")
    public @ResponseBody String user (){
        return "user";
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/admin")
    public @ResponseBody String admin (){
        return "admin";
    }

    @PreAuthorize("hasRole('ROLE_MANAGER') or hasRole('ROLE_ADMIN')")
    @GetMapping("/manager")
    public @ResponseBody String manager (){
        return "manager";
    }

    @GetMapping("/loginForm")
    public  String login (){
        return "loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm (){
        return "joinForm";
    }

    @PostMapping("/join")
    public @ResponseBody String join (User user){
        System.out.println(user);
        user.setRole("ROLE_USER");
        String encPassword = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encPassword);
        repository.save(user);
        return "join";
    }

    @GetMapping("/main")
    public String main(){
        return "main";
    }

}
