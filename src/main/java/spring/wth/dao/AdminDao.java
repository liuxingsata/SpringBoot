package spring.wth.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import spring.wth.bean.Admin;

import java.io.Serializable;

/**
 * Created by wangth on 2016/10/31.
 */
public class AdminDao implements Serializable{

  public Admin findAdmin(Admin admin){
    SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session session = sf.openSession();
    session.beginTransaction();
    Admin a = session.get(Admin.class,1);
    session.getTransaction().commit();
    session.close();
    sf.close();
    return a;
  }
}
