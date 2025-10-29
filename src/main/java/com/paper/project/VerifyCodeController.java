package com.paper.project;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.paper.BBM.UserManager;

@Controller
public class VerifyCodeController {
    @RequestMapping("/verifycode")
    @ResponseBody
    public String sendcode(String email) throws ClassNotFoundException, SQLException{
        UserManager usermanager=new UserManager();
        return usermanager.sendRegisterCode(email);
    }
}