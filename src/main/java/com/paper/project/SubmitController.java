package com.paper.project;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.paper.BBM.UserManager;
import com.paper.Entity.User;

@Controller
public class SubmitController {
    @RequestMapping("/submit")
    @ResponseBody
    public String setUser(String uname,String password,String email,String verifycode) throws ClassNotFoundException, SQLException{
        User user=new User();
        user.setUname(uname);
        user.setPassword(password);
        user.setEmail(email);
        UserManager usermanager=new UserManager();
        return usermanager.registerByEmail(user,verifycode);
    }
}