package com.tydic.dubbo.service.impl.user;

import com.tydic.dubbo.dao.user.UserDao;
import com.tydic.dubbo.model.user.User;
import com.tydic.dubbo.service.user.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/8/2 10:57
 */
public class UserServiceImpl  implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> queryUserList(User user) {
        List<User> list = new ArrayList<>();
//        list = userDao.queryUserList(user);
        User user1 = new User();
        user1.setId(1);
        user1.setName("张三");
        user1.setGender("男");
        User user2 = new User();
        user2.setId(2);
        user2.setName("李四");
        user2.setGender("女");
        list.add(user1);
        list.add(user2);
        return list;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

}
