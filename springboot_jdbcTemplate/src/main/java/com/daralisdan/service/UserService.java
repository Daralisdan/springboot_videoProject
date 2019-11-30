package com.daralisdan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  
  @Autowired
  private JdbcTemplate jdbcTemplate;

  public void createUser(String name, Integer age) {
    System.out.println("创建用户");
    jdbcTemplate.update("insert into user values (null,?,?);",name,age);
    System.out.println("创建成功"+"姓名："+name+"年龄："+age);
  }

}
