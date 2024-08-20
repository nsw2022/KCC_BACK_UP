package com.kcc.restfulservice.mapper;

import com.kcc.restfulservice.myresultfulservice.bean.Post;
import com.kcc.restfulservice.myresultfulservice.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    // 전체 유저 조회
    public List<User> findAllUsers();

    // 유저 하나 조회
    public User findUser(int id);

    // 유저 생성
    public void createUser(User user);

    // 댓글 생성
    public void createPost(Post post);
}
