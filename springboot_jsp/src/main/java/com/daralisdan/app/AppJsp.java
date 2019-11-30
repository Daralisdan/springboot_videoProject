package com.daralisdan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.daralisdan.controller")
@EnableAutoConfiguration
public class AppJsp {
  // 主函数，springboot程序启动入口
  public static void main(String[] args) {
    SpringApplication.run(AppJsp.class, args);
  }

}
