package com.kcc.restfulservice.service;

import com.kcc.restfulservice.mapper.UserMapper;
import com.kcc.restfulservice.myresultfulservice.bean.Post;
import com.kcc.restfulservice.myresultfulservice.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public List<User> findAll() {
        return mapper.findAllUsers();
    }

    public User findOne(int id){
        return mapper.findUser(id);
    }

    public  User save(User user){
        mapper.createUser(user);
        return user;
    }

    public void savePost(Post post){
        mapper.createPost(post);
    }

}
