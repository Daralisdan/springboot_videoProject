package com.daralisdan.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration // 该注解表示项目启动时自动注入spring容器，创建Tomcat，该注解表示只扫当前的类
@RestController // @RestController 该注解表示该接口的所有方法返回的数据都是json格式， 相当于@controller+@ResponseBody结合
public class HelloWorldController {

  @RequestMapping("/index")
  public String index() {
    return "success";
  }

  @RequestMapping("/getMap")
  public Map<String, Object> getMap() {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("error", "200");
    map.put("errorMsg", "成功");
    return map;
  }

//  public static void main(String[] args) {
//    //主函数程序入口，运行Springboot项目
//    SpringApplication.run(HelloWorldController.class, args);
//  }
}
