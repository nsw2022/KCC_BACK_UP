package com.kcc.restfulservice.myresultfulservice;

import com.kcc.restfulservice.myresultfulservice.bean.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCounter = 4;

    static {
        users.add(new User(1, "kim", new Date(), "pass1","701010-1111111"));
        users.add(new User(2, "lee", new Date(),"pass2","980303-1111111"));
        users.add(new User(3, "park", new Date(),"pass3","000101-4444444"));

    }

    public  List<User> findAll() {return users;}
    public  User findByOen(int id) {return users.get(id);}

    public User save(User user) {
        if (user.getId()==null){
            user.setId(userCounter);
        }
        if (user.getJoinDate()==null){
            user.setJoinDate(new Date());
        }
        users.add(user);

        return user;
    }

    public User delete(int id) {
        return users.remove(id);
    }


}
