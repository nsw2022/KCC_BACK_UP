package com.kcc.restfulservice.myresultfulservice.bean;

import com.kcc.restfulservice.myresultfulservice.UserDaoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
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

    @GetMapping("/findByOen")
    public User  findByOen(@RequestParam int id) {
        return userDaoService.findByOen(id);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userDaoService.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                            .path("/{id}")
                            .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }



}
