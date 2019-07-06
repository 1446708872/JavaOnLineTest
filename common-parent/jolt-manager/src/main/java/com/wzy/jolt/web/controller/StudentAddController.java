package com.wzy.jolt.web.controller;

import com.wzy.jolt.model.Class;
import com.wzy.jolt.web.controller.base.BaseControllerImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("stu")
public class StudentAddController extends BaseControllerImpl {
    @RequestMapping("addClass")
    public  @ResponseBody String addClass(Class cla){
        Class byIntClass = classService.findByIntClass(cla);
        if(byIntClass != null) return "false";
        classService.insertT(cla);
        return "true";
    }

    @RequestMapping("addStudent")
    public String addStudent(){
        return null;
    }

    @RequestMapping("exportStudent")
    public String exportStudent(){
        return null;
    }

    @RequestMapping("inportStudent")
    public String inportStudent(){
        return null;
    }
}
