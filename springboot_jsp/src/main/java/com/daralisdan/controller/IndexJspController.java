package com.daralisdan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexJspController {

  @RequestMapping("jspIndex")
  public String jspIndex() {
    return "index"; // 该处返回的index是/WEB-INF/jsp/下的index.jsp页面

  }

}
