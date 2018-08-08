package com.tydic.dubbo.dao.user;

import com.tydic.dubbo.model.user.User;

import java.util.List;


public interface UserDao {

    public List<User> queryUserList(User user);
}
