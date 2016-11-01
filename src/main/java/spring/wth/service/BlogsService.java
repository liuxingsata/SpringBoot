package spring.wth.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.wth.bean.Blogs;
import spring.wth.dao.BlogsDao;

/**
 * Created by wangth on 2016/11/1.
 */
@Service
@Slf4j
public class BlogsService {

  public Blogs create(Blogs blogs){
    BlogsDao blogsDao = new BlogsDao();
    try {
      blogsDao.create(blogs);
    }catch (Exception e){
      log.debug("create error",e);
    }
    return blogs;
  }
}
