package com.dounine.myblog.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dounine.myblog.bean.User;
import com.dounine.myblog.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public User findById(String id) {
        String sql = "select * from user where stuId = ?";
        try {
            @SuppressWarnings({ "unchecked", "rawtypes" })
			User user = (User) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(User.class), id);
            return user;
        } catch (IncorrectResultSizeDataAccessException e) {
            System.out.println(e);
            return null;
        }
    }


    @Override
    public int insert(User user) {
        String sql = "insert into user(stuId, userName, phone, descb)" +
                "values(?, ?, ?, ?)";
        return jdbcTemplate.update(sql, user.getStuId(), user.getUserName(), user.getPhone(), user.getDescb());
    }

    @Override
    public int update(User newUser) {
        String sql = "update user set stuId=?, userName=?, phone=?, descb=?" + "where stuId=?";
        return jdbcTemplate.update(sql, newUser.getStuId(), newUser.getUserName(), newUser.getPhone(), newUser.getDescb(), newUser.getStuId());
    }
}
