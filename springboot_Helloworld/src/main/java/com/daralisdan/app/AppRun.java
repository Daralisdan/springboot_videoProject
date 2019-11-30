package com.daralisdan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.daralisdan.controller")
public class AppRun {
  public static void main(String[] args) {
    // 主函数程序入口，运行Springboot项目
    SpringApplication.run(AppRun.class, args);
  }
}
