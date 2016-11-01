package spring.wth;

/**
 * Created by wangth on 2016/10/26.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//启用自动配置
@ComponentScan//组件扫描
public class Application {
  public static void main(String[] args) throws Exception {
    //启动Spring Boot项目的唯一入口
    SpringApplication.run(Application.class, args);
  }
}