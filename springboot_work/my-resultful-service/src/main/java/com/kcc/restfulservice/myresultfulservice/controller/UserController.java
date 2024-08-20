package com.kcc.restfulservice.myresultfulservice.controller;

import com.kcc.restfulservice.exception.UserNotFoundException;

import com.kcc.restfulservice.myresultfulservice.bean.Post;
import com.kcc.restfulservice.myresultfulservice.bean.User;
import com.kcc.restfulservice.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserController {
    private final UserService service;

    //private userDaoService service;
    public UserController(UserService userService) {
        this.service = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return service.findAll();
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User savedUser = service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @PostMapping("/users/{id}/posts")
    public ResponseEntity<Post> createPost(@PathVariable int id, @RequestBody Post post) {
        service.savePost(post);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(post.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
/*
    @GetMapping("/users/{id}")
    public EntityModel<User> findByOen(@PathVariable int id) {
        User user = service.findByOen(id-1);
        if(user == null) {
            throw new UserNotFoundException(String.format("ID[%s] not found", id));
        }

        EntityModel<User> entityModel = EntityModel.of(user);
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getUsers());
        entityModel.add(linkTo.withRel("all-users"));

        return entityModel;
    }



    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = service.delete(id-1);
        if(user == null) {throw new UserNotFoundException(String.format("ID[%s] not found", id));}
    }

*/

}
