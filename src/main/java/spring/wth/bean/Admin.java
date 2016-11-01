package spring.wth.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;


/**
 * Created by wangth on 2016/10/31.
 */
@Entity
@Table(name = "admins")
@Data
@Component
public class Admin {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String username;
  private String password;

}
