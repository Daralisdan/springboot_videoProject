package com.daralisdan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @RestController 该注解表示该接口的所有方法返回的数据都是json格式， 相当于@controller+@ResponseBody结合
public class indexController {

  @RequestMapping("/indexExcept")
  public String index() {
    int i=1/0;
    return "index"; //返回的是这个方法
  }

  


}
