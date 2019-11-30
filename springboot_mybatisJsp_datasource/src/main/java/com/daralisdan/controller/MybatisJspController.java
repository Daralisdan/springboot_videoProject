package com.daralisdan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.daralisdan.entity.User;
import com.daralisdan.mapper.UserMapper;
import com.daralisdan.test01.dao.UserMapperTest01;
import com.daralisdan.test02.dao.UserMapperTest02;

// 整合jsp要想显示页面。注意controller层不能用@RestController
@Controller
public class MybatisJspController {
  @Autowired
  private UserMapper userMapper;
  @Autowired
  private UserMapperTest01 userMapperTest01;
  @Autowired
  private UserMapperTest02 userMapperTest02;

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

  /**
   * 新增用户（test01数据源）
   */
  @RequestMapping("insertTest01")
  @ResponseBody
  public String insertTest01(String name, Integer age) {
    userMapperTest01.insert(name, age);
    return "success";
  }

  /**
   * 新增用户（test02数据源）
   */
  @RequestMapping("insertTest02")
  @ResponseBody
  public String insertTest02(String name, Integer age) {
    userMapperTest02.insert(name, age);
    return "success";
  }
}
