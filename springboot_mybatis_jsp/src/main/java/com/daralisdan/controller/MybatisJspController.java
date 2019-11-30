package com.daralisdan.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.daralisdan.entity.User;
import com.daralisdan.mapper.UserMapper;
//整合jsp要想显示页面。注意controller层不能用@RestController
@Controller
public class MybatisJspController {
  @Autowired
  private UserMapper userMapper;

  @RequestMapping("jspIndex")
  public String jspIndex() {
    return "index"; // 该处返回的index是/WEB-INF/jsp/下的index.jsp页面
  }

  /**
   * 查询用户
  */
  @RequestMapping("findByName")
  @ResponseBody
  public User findByName(String name) {
    return userMapper.findByName(name);
  }

  /**
  * 新增用户
  */
  @RequestMapping("insert")
  @ResponseBody
  public String insert(String name, Integer age) {
    userMapper.insert(name, age);
    return "success";
  }
}
