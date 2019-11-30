package com.daralisdan.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * Description：全局异常捕获类 <br>
 * 全局捕获异常通过的原理是：异常通知，然后捕获异常
 * @author yaodan  <br>
 * date 2019年8月28日 下午10:42:38 <br>
 */
@ControllerAdvice // advice面向切面 aop
public class GlobalExceptionHandler {
  //捕获运行时异常
  @ExceptionHandler(RuntimeException.class)
  
  //该方法返回的是 500，运行时异常错误，如果是404错误不用加@ResponseBody该注解
  //如果返回json格式，加上@ResponseBody该注解，如果是返回页面，直接返回string类型，类型结果指定404页面
  @ResponseBody
  public Map<String, Object> resultError() {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("error", "500");
    map.put("errorMsg", "系统错误");
    return map;
  }
}
