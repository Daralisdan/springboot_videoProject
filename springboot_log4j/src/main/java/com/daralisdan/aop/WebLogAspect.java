package com.daralisdan.aop;

import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.daralisdan.controller.Log4jController;


/**
 *
 * Description：AOP统一管理web日志类 <br>
 * @author yaodan <br>
 * date 2019年9月5日 下午4:30:28 <br>
 */
@Aspect // 定义切面
@Component // 把切面注入到spring容器中
public class WebLogAspect {

  private static Logger logger = Logger.getLogger(WebLogAspect.class);

  /**
  *
  * Title：logWeb <br>
  * Description：切入点表达式<br>
  * author：yaodan <br>
  * date：2019年9月5日 下午4:59:22 <br> <br>
  */
  @Pointcut("execution(public * com.daralisdan.controller..*.*(..))")
  public void logWeb() {

  }

  @Before("logWeb()") // 表示请求之后开始拦截
  public void doBefore(JoinPoint joinPoint) throws Throwable {
    // 接收请求之后，记录请求内容
    // 获取request请求对象
    ServletRequestAttributes attributes =
        (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    HttpServletRequest request = attributes.getRequest();

    logger.info("###########请求开始#####################################");
    // 获取之后打印相应对象
    // 记录下请求内容
    logger.info("Url:" + request.getRequestURL().toString()); // 请求路径
    logger.info("Http_Method:" + request.getMethod()); // 请求的方式
    logger.info("IP：" + request.getRemoteAddr()); // 请求地址
    Enumeration<String> enu = request.getParameterNames();
    while (enu.hasMoreElements()) {
      String name = (String) enu.nextElement();
      logger.info("name:{" + name + "},value:{" + request.getParameter(name) + "}");
    }
  }

  @AfterReturning(returning = "ret", pointcut = "logWeb()")
  public void doAfterReturning(Object ret) throws Throwable {
    // 处理完请求，返回内容
    logger.info("RESPONSE : " + ret);
    logger.info("###########请求完成#####################################");
  }
}
// }
// @Aspect
// @Component
// public class WebLogAspect {
// // log4j代码
// private static Logger log = Logger.getLogger(WebLogAspect.class);
//
// @Pointcut("execution(public * com.daralisdan.controller..*.*(..))")
// public void webLog() {}
//
// @Before("webLog()")
// public void doBefore(JoinPoint joinPoint) throws Throwable {
// // 接收到请求，记录请求内容
// ServletRequestAttributes attributes =
// (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
// HttpServletRequest request = attributes.getRequest();
// log.info("###########请求完成#####################################");
// // 记录下请求内容
// log.info("URL : " + request.getRequestURL().toString());
// log.info("HTTP_METHOD : " + request.getMethod());
// log.info("IP : " + request.getRemoteAddr());
// Enumeration<String> enu = request.getParameterNames();
// while (enu.hasMoreElements()) {
// String name = (String) enu.nextElement();
// log.info("name:{" + name + "},value:{" + request.getParameter(name) + "}");
// }
// }
//
// @AfterReturning(returning = "ret", pointcut = "webLog()")
// public void doAfterReturning(Object ret) throws Throwable {
// // 处理完请求，返回内容
// log.info("RESPONSE : " + ret);
// log.info("###########请求完成#####################################");
// }
// }
