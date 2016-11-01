package spring.wth.dao;

import org.hibernate.Session;
import spring.wth.bean.Admin;

import java.io.Serializable;

/**
 * Created by wangth on 2016/10/31.
 */
public class AdminDao implements Serializable{

  public Admin findAdmin(){
    Session session = HibernateUtil.currentSession();
    session.beginTransaction();
    Admin admin = session.get(Admin.class,1);
    session.getTransaction().commit();
    HibernateUtil.closeSession();
    return admin;
  }
}
