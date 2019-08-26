package com.dounine.myblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.dounine.myblog.bean.User;
import com.dounine.myblog.dao.UserDao;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public JSONObject findById(@RequestParam String id) {
        User user = userDao.findById(id);
        JSONObject retMsg = new JSONObject();
        if (user != null) {
            retMsg.put("code", 1);
            retMsg.put("msg", "find this user successfully");
            retMsg.put("data", JSONObject.toJSONString(user));
        }
        else {
            retMsg.put("code", 0);
            retMsg.put("msg", "no this user");
        }
        return retMsg;
    }


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public JSONObject update(@RequestBody User user) {
        JSONObject retMsg = new JSONObject();
        if (userDao.update(user) > 0) {
            retMsg.put("code", 1);
            retMsg.put("msg", "success");
        }
        else {
            retMsg.put("code", 0);
            retMsg.put("msg", "update error");
        }
        return retMsg;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JSONObject insert(@RequestBody User user) {
    	System.err.println("post data is: "+user.getDescb());
    	JSONObject retMsg = new JSONObject();
    	// 查询是否已存在
    	User tmpUser = userDao.findById(user.getStuId());
    	if (tmpUser != null) {
    		retMsg.put("code", -1);
            retMsg.put("msg", "always exits");
    	} else if (userDao.insert(user) > 0) {
            retMsg.put("code", 1);
            retMsg.put("msg", "success");
        }
        else {
            retMsg.put("code", 0);
            retMsg.put("msg", "insert error");
        }
        return retMsg;
    }
}
