package com.daralisdan.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexTemplate {
  
  @RequestMapping("/indexTemp")
  public String indexTemp(Map<String, Object> result) {
    result.put("name", "yushengjun");
    result.put("sex", "1");
  List<String> listResult = new ArrayList<String>();
  listResult.add("zhangsan");
  listResult.add("lisi");
  listResult.add("itmayiedu");
  result.put("userlist", listResult);
    return "index"; //该index表示的是index.ftl页面
  }
}

