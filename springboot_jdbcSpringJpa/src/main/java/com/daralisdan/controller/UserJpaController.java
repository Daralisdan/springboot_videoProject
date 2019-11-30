package com.daralisdan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.daralisdan.dao.UseIDao;
import com.daralisdan.entity.User;

@RestController
public class UserJpaController {

  @Autowired
  private UseIDao useIDao;

  @RequestMapping("getUser")
  public User getUser(Integer id) {
    System.out.println("查询用户：" + id);
    return useIDao.findOne(id);

  }

}
