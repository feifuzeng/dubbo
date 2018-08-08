package com.tydic.dubbo.service.user;

import com.tydic.dubbo.model.user.User;

import java.util.List;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/8/2 10:53
 */
public interface UserService {

    public List<User> queryUserList(User user);

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);
}
