package com.kcc.restfulservice.myresultfulservice.controller;

import com.kcc.restfulservice.exception.UserNotFoundException;
import com.kcc.restfulservice.myresultfulservice.UserDaoService;
import com.kcc.restfulservice.myresultfulservice.bean.User;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UserDaoService userDaoService;

    @GetMapping("/users")
    public List<User> getUsers() {return userDaoService.findAll();}

    @GetMapping("/users/{id}")
    public User  findByOen(@PathVariable int id) {
        User user = userDaoService.findByOen(id-1);
        if(user == null) {
            throw new UserNotFoundException(String.format("ID[%s] not found", id));
        }
        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = userDaoService.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                            .path("/{id}")
                            .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = userDaoService.delete(id-1);
        if(user == null) {throw new UserNotFoundException(String.format("ID[%s] not found", id));}
    }



}
