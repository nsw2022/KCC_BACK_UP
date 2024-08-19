package com.kcc.restfulservice.myresultfulservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDao {
    private  Integer id;
    private  String name;
    private Date JoinDate;

}
