//package com.kcc.restfulservice.myresultfulservice.controller;
//
//import com.kcc.restfulservice.exception.UserNotFoundException;
//
//import com.kcc.restfulservice.myresultfulservice.bean.Post;
//import com.kcc.restfulservice.myresultfulservice.bean.User;
//import com.kcc.restfulservice.repository.PostRepository;
//import com.kcc.restfulservice.repository.UserRepository;
//import jakarta.validation.Valid;
//import lombok.AllArgsConstructor;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import java.net.URI;
//import java.util.List;
//import java.util.Optional;
//
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
//
//@RestController
//@RequestMapping("/jpa")
//@AllArgsConstructor
//public class UserJpaController {
//
//    private UserRepository userRepository;
//
//    private PostRepository postRepository;
//
//    @GetMapping("/users")
//    public List<User> getUsers() {
//        return userRepository.findAll();
//    }
//
//    @GetMapping("/users/{id}")
//    public EntityModel<Optional<User>> findByOen(@PathVariable int id) {
//        Optional<User> user = userRepository.findById(id);
//
//        if (user.isEmpty()) {
//            throw new UserNotFoundException(String.format("ID[%s] not found", id));
//        }
////
//        EntityModel<Optional<User>> entityModel = EntityModel.of(user);
//        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getUsers());
//        entityModel.add(linkTo.withRel("all-users"));
//
//        return entityModel;
//    }
//
//    //
//    @PostMapping("/users")
//    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
//        User savedUser = userRepository.save(user);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(savedUser.getId()).toUri();
//
//        return ResponseEntity.created(location).build();
//    }
//
//    //
//    @DeleteMapping("/users/{id}")
//    public void deleteUser(@PathVariable int id) {
//
//        userRepository.deleteById(id);
//
//    }
//
//    @GetMapping("/users/{id}/posts")
//    public List<Post> retrieveAllPostsByUser(@PathVariable int id) {
//        Optional<User> user = userRepository.findById(id);
//        if (user.isEmpty()) {
//            throw new UserNotFoundException(String.format("ID[%s] not found", id));
//        }
//        return user.get().getPosts();
//    }
//
//    @PostMapping("/users/{id}/posts")
//    public ResponseEntity<Object> createPost(@RequestBody Post post, @PathVariable int id) {
//        Optional<User> user = userRepository.findById(id);
//        if (user.isEmpty()) {
//            throw new UserNotFoundException(String.format("ID[%s] not found", id));
//        }
//
//        post.setUser(user.get());
//        Post savedPost = postRepository.save(post);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(savedPost.getId()).toUri();
//
//        return ResponseEntity.created(location).build();
//    }
//
//    @GetMapping("/users/{id}/posts/{post_id}")
//    public EntityModel<Optional<Post>> getPost(@PathVariable int id, @PathVariable int post_id) {
//        Optional<User> user = userRepository.findById(id);
//        if (user.isEmpty()) {
//            throw new UserNotFoundException(String.format("User ID[%s] not found", id));
//        }
//
//        Optional<Post> post = postRepository.findById(post_id);
//        if (post.isEmpty()) {
//            throw new UserNotFoundException(String.format("Post ID[%s] not found", post_id));
//        }
//
//        // HATEOAS 링크 추가
//        EntityModel<Optional<Post>> model = EntityModel.of(post);
//        WebMvcLinkBuilder linkToUser = linkTo(methodOn(this.getClass()).getUsers());
//        WebMvcLinkBuilder linkToPosts = linkTo(methodOn(this.getClass()).retrieveAllPostsByUser(id));
//
//        model.add(linkToUser.withRel("user-details"));
//        model.add(linkToPosts.withRel("all-posts-by-user"));
//
//        return model;
//    }
//
//
//
//}
