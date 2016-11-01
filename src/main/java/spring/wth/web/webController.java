package spring.wth.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.wth.bean.Admin;
import spring.wth.bean.Blogs;
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
  public String login(Admin admin,Model model) {
    Admin u = service.login(admin);
    if (u == null) {
      return "error";
    }
    model.addAttribute("user",u);
    return "admin";
  }

  @RequestMapping("/create")
  public String create(Blogs blogs) {

    return "index";
  }
}
