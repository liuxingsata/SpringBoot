package spring.wth.service;

import org.springframework.stereotype.Service;
import spring.wth.bean.Admin;
import spring.wth.dao.AdminDao;

/**
 * Created by wangth on 2016/10/31.
 */
@Service
public class AdminLoginService {
  public Admin login(Admin admin){
    AdminDao adminDao = new AdminDao();
    Admin a = adminDao.findAdmin(admin);
    if(a.getUsername().equals(admin.getUsername())&&a.getPassword().equals(admin.getPassword())){
      return admin;
    }
    return null;
  }
}
