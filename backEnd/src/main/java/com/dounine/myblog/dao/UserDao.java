package com.dounine.myblog.dao;

import com.dounine.myblog.bean.User;

public interface UserDao {
    public User findById(String userId);

    public int insert(User user);

    public int update(User newUser);
}
