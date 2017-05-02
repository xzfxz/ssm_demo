package com.zhao.ssm.service;

import com.zhao.ssm.bean.User;

import java.util.List;

/**
 * Created by zhao on 2017/3/29.
 */
public interface UserService {
    public void saveUser(User user);

    public void updateUser(User user);

    public User getUser(int id);

    public List<User> getAll();
}
