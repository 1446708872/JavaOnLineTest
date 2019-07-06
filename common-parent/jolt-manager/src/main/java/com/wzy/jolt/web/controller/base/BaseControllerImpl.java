package com.wzy.jolt.web.controller.base;

import com.wzy.jolt.service.ClassService;
import com.wzy.jolt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseControllerImpl {
    @Autowired
    public UserService userService;

    @Autowired
    public ClassService classService;
}
