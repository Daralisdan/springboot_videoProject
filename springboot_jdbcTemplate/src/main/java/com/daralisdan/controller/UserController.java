package com.daralisdan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.daralisdan.service.UserService;

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping("createUser")
  public String CreateUser(String name, Integer age) {
    userService.createUser(name, age);
    return "success";

  }
}
