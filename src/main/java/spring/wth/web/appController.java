package spring.wth.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangth on 2016/11/1.
 */
@Controller
public class appController {
  @RequestMapping("/")
  public String index() {
    return "index";
  }
}
