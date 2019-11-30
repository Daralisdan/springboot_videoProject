package com.daralisdan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.daralisdan.controller", "com.daralisdan.service"})
@EnableAutoConfiguration
public class AppJdbc {

  // 程序运行时的入口
  public static void main(String[] args) {
    SpringApplication.run(AppJdbc.class, args);
  }
}
