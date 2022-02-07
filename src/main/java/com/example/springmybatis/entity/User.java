package com.example.springmybatis.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String roleCode;
    private String roleName;
}
