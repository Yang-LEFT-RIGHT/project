package com.paper.project;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paper.BBM.UserManager;
import com.paper.Entity.User;

@Controller
public class LoginController {
    @RequestMapping("/login")
    @ResponseBody
    public String login(String uname,String password) throws ClassNotFoundException, SQLException{
        User user=new User();
        UserManager usermanager=new UserManager();
        user.setUname(uname);
        user.setPassword(password);
        if(usermanager.login(user)){
            return "登录成功";
        }
        else{
            return "用户名或密码错误";
        }
    }
}