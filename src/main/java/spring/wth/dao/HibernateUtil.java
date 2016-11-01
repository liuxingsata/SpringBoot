package spring.wth.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by wangth on 2016/11/1.
 */

public class HibernateUtil {
  public static final SessionFactory sessionFactory;

  //创建sessionFactory
  static {
    try {
      // 采用默认的hibernate.cfg.xml来启动一个Configuration的实例
      Configuration cfg = new Configuration()
          .configure();
      // 以Configuration实例来创建SessionFactory实例
      sessionFactory = cfg.buildSessionFactory();
    } catch (Throwable ex) {
      System.err.println("Initial SessionFactory creation failed." + ex);
      throw new ExceptionInInitializerError(ex);
    }
  }

  // ThreadLocal可以隔离多个线程的数据共享，因此不再需要对线程同步
  public static final ThreadLocal<Session> session
      = new ThreadLocal<Session>();

  //创建Session
  public static Session currentSession()
      throws HibernateException {
    //通过线程对象.get()方法安全创建Session
    Session s = session.get();
    // 如果该线程还没有Session,则创建一个新的Session
    if (s == null) {
      s = sessionFactory.openSession();
      // 将获得的Session变量存储在ThreadLocal变量session里
      session.set(s);
    }
    return s;
  }

  //关闭Session
  public static void closeSession()
      throws HibernateException {
    Session s = session.get();
    if (s != null)
      s.close();
    session.set(null);
  }
}