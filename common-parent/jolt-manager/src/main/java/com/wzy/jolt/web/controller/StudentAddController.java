package com.wzy.jolt.web.controller;

import com.wzy.jolt.model.ChangePassword;
import com.wzy.jolt.model.Class;
import com.wzy.jolt.model.Ltmit;
import com.wzy.jolt.model.User;
import com.wzy.jolt.web.controller.base.BaseControllerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.regex.Pattern;

@Controller
@RequestMapping("stu")
public class StudentAddController extends BaseControllerImpl {
    @RequestMapping(value = "addClass" )
    public  @ResponseBody String addClass(Class cla){
        Class byIntClass = classService.findByIntClass(cla);
        if(byIntClass != null) return "false";
        classService.insertT(cla);
        return "true";
    }

    @RequestMapping(value = "addStudent")
    public String addStudent(){
        return null;
    }

    @RequestMapping(value = "exportStudent")
    public String exportStudent(){
        return null;
    }

    @RequestMapping( value = "inportStudent")
    public String inportStudent(){
        return null;
    }

    @RequestMapping( value = "getClass")
    public  @ResponseBody List<Class> getClass(HttpSession session){
        return classService.findByList();
    }

    @RequestMapping(value = "getStudent")
    public  @ResponseBody List<User> getStudent(int selectId){
        return userService.findByIntIdList(selectId);
    }

    @RequestMapping(value = "getByIdClass")
    public @ResponseBody Class getByIdClass(Class cla){
        return classService.findByIntId(cla.getClass_user());
    }

    @RequestMapping(value = "updateClass")
    public @ResponseBody String updateClass(Class cla){
        classService.updateT(cla);
        return "true";
    }

    @RequestMapping(value = "deleteByIdClass")
    public  @ResponseBody List<Class> deleteByIdClass(HttpSession session, int class_user){
        userService.deleteByStrId(String.valueOf(class_user));
        classService.deleteByIntId(class_user);
        return classService.findByList();
    }

    @RequestMapping(value = "deleteByIdStudent")
    public  @ResponseBody List<User> deleteByIdClass(int selectId ,int id){
        userService.deleteByIntId(id);
        return userService.findByIntIdList(selectId);
    }

    @RequestMapping(value = "query")
    public @ResponseBody List query(String o,String val){
        List list =null;
        switch (o){
            case "class":
                Class cla = new Class();
                if((Pattern.compile("[0-9]*")).matcher(val).matches()){
                    cla.setClass_user(Integer.valueOf(val));
                    list  = classService.query(cla);
                    if(list!=null)return list;
                    cla.setClass_user(null);
                }

                cla.setClass_major(val);
                list  = classService.query(cla);
                if(list!=null)return list;
                cla.setClass_major(null);

                cla.setClass_age(val);
                list = classService.query(cla);
                if(list!=null)return list;
                cla.setClass_age(null);
                break;
            case "user":
                User user=new User();
                if((Pattern.compile("[0-9]*")).matcher(val).matches()){
                    user.setUser_id(Integer.valueOf(val));
                    list = userService.query(user);
                    if(list!=null)return list;
                    user.setUser_id(null);

                    user.setUser_class(Integer.valueOf(val));
                    list = userService.query(user);
                    if(list!=null)return list;
                    user.setUser_class(null);
                }

                user.setName(val);
                list = userService.query(user);
                if(list!=null)return list;
                user.setName(null);

                user.setSex(val);
                list = userService.query(user);
                if(list!=null)return list;
                user.setSex(null);
                break;
        }
        return list;
    }
}
