package com.wzy.jolt.web.controller;

import com.wzy.jolt.model.ChangePassword;
import com.wzy.jolt.model.Title;
import com.wzy.jolt.model.User;
import com.wzy.jolt.service.UserService;
import com.wzy.jolt.web.SessionSave.SessionSave;
import com.wzy.jolt.web.controller.base.BaseControllerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController  extends BaseControllerImpl {

    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("mian")
    public String mian(HttpSession session, Model model){
        User user = (User) session.getAttribute("user");
        List<Title> byIntIdTitleList = userService.findByIntIdTitleList(user.getPower_title());
        model.addAttribute("user",user);
        model.addAttribute("title",byIntIdTitleList);
        return "mian";
    }

    @RequestMapping("exit")
    public String exit(HttpSession session){
        session.removeAttribute("user");
        return "forward:login.do";
    }

    @RequestMapping("userLogin")
    public @ResponseBody String userLogin(User user, HttpSession session){
        Integer JSON = 0;

        //判断是否已经有用户登陆
        if(session.getAttribute("user")!=null){
            JSON =2;
            return String.valueOf(JSON);
        }

        //判断用户ID是否存在
        User byIntId = userService.findByIntId(Integer.valueOf(user.getUser_id()));
        if(byIntId!=null){

            //判断用户密码是否正确
            if(byIntId.getPassword().equals(user.getPassword())) {

                //判断用户是否在其他地方登陆
                if(SessionSave.getSessionIdSave().containsKey(user.getUser_id())&&!session.getId().equals(SessionSave.getSessionIdSave().get(user.getUser_id()))){
                    SessionSave.getSessionIdSave().remove(user.getUser_id());
                }

                //将用户与sessionID存入自制全局变量
                SessionSave.getSessionIdSave().put(String.valueOf(user.getUser_id()),session.getId());

                //登陆成功将用户存入session
                session.setAttribute("user",byIntId);
                JSON = user.getUser_id();
            }else JSON = 1;
        }
        return String.valueOf(JSON);
    }

    @RequestMapping("changePassword")
    public  @ResponseBody String changePassword(ChangePassword changePassword,HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user.getPassword().equals(changePassword.getOriginalPassword())){
            return "1";
        }
        return "0";
    }
}
