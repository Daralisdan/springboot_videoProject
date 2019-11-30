package com.daralisdan.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.daralisdan.controller")
@MapperScan("com.daralisdan.mapper")
public class AppJspMybatis {

  public static void main(String[] args) {
    SpringApplication.run(AppJspMybatis.class, args);
  }
}
