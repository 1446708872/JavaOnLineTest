package com.wzy.jolt.web.controller;

import com.wzy.jolt.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("mian")
    public String mian(){
        return "mian";
    }

    @RequestMapping("userLogin")
    public @ResponseBody String userLogin(User user){
        return String.valueOf(user.getUserId());
    }
}
