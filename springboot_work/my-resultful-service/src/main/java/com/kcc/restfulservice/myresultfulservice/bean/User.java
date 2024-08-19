package com.kcc.restfulservice.myresultfulservice.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(value = {"password","ssn"})
public class User {
    private  Integer id;
    @Size(min = 2, message = "Name은 2글자 이상 입력해주세요")
    private  String name;
    private Date JoinDate;

    //@JsonIgnore
    private String password;
    //@JsonIgnore
    private String ssn;
}
