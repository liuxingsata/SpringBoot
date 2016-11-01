package spring.wth.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wangth on 2016/11/1.
 */
@Entity
@Table(name = "blogs")
@Data
@Component
public class Blogs {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private String blogs;
  private Date createtime;

}