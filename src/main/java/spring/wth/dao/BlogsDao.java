package spring.wth.dao;

import org.hibernate.Session;
import spring.wth.bean.Blogs;

/**
 * Created by wangth on 2016/11/1.
 */
public class BlogsDao {

  public Blogs create(Blogs blogs){
    Session session = HibernateUtil.currentSession();
    session.beginTransaction();
    session.save(blogs);
    session.getTransaction().commit();
    HibernateUtil.closeSession();
    return blogs;
  }
}
