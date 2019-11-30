package com.daralisdan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // 该注解表示整合常用的注解，但是它只作用在同级当前目录下
// @EnableAutoConfiguration
// @ComponentScan("com.daralisdan.controller")
@MapperScan("com.daralisdan.mapper")
public class AppJspMybatis {

  public static void main(String[] args) {
    SpringApplication.run(AppJspMybatis.class, args);
  }
}
