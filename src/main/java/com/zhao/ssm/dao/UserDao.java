package com.zhao.ssm.dao;

import com.zhao.ssm.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhao on 2017/4/28.
 */
@Repository(value = "userDao")
 public interface UserDao {
     void add(User user);
     void delete(long id);
     void update(User user);
     User getById(long id);
     List<User> getAll();

}
