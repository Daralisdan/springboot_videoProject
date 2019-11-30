package com.daralisdan.scheduled;

import org.springframework.stereotype.Component;

/**
 * 
 * Description：该类是执行任务调度 <br>
 * @author yaodan  <br>
 * date 2019年9月5日 下午5:33:39 <br>
 */
@Component
public class Scheduled {

  @org.springframework.scheduling.annotation.Scheduled(fixedRate = 1000)
  public void test() {
    System.out.println("每隔一秒打印---");
  }
}
