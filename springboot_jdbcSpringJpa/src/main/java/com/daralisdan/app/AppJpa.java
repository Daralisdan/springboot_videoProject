package com.daralisdan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.daralisdan.controller")
@EnableJpaRepositories("com.daralisdan.dao")
@EnableAutoConfiguration
@EntityScan("com.daralisdan.entity")
public class AppJpa {

  // 程序运行时的入口
  public static void main(String[] args) {
    SpringApplication.run(AppJpa.class, args);
  }
}
