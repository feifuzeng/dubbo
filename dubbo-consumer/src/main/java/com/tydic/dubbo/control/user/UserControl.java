package com.tydic.dubbo.control.user;

import cn.model.user.User;
import com.tydic.dubbo.result.ListResult;
import com.tydic.dubbo.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/8/2 11:03
 */
@Controller
@RequestMapping("/user")
public class UserControl {

    @Resource
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public ListResult<User> queryUserList(User user){
        ListResult<User> result = new ListResult<User>();
        try{
            List<User> list = userService.queryUserList(user);
            result.setData(list);
        }catch (Exception e){
            result.setErrorMessage("查询出错："+e.getMessage());
            return result;
        }
       return result;
    }
}
