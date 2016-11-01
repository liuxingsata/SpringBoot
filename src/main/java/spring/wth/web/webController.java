package spring.wth.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.wth.bean.Admin;
import spring.wth.service.AdminLoginService;

/**
 * Created by wangth on 2016/10/31.
 */
@Controller
@RequestMapping("/liuxingsata")
public class webController{

  @Autowired
  private AdminLoginService service;

  @RequestMapping("/login")
  @ResponseBody
  String login(Admin admin) {
    Admin u = service.login(admin);
    if (u == null) {
      return "failed";
    }
    return "Hello " + u.getUsername();
  }

}
