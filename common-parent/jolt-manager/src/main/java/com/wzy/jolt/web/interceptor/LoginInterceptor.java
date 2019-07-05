package com.wzy.jolt.web.interceptor;

import com.wzy.jolt.model.User;
import com.wzy.jolt.web.SessionSave.SessionSave;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

import static com.wzy.jolt.web.SessionSave.SessionSave.*;
import static com.wzy.jolt.web.SessionSave.SessionSave.getSessionIdSave;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        HttpSession session = request.getSession();

        //如果时登陆界面就放行
        if(request.getServletPath().equals("/user/login.do")||request.getServletPath().equals("/user/userLogin.do")){
            return true;
        }

        //如果用户存在
        if(request.getSession().getAttribute("user")!=null){
            User user = (User) session.getAttribute("user");
            String user_id = String.valueOf(user.getUser_id());

            String sessionSaveId = getSessionIdSave().get(user_id);
            String sessionId = session.getId();

            //如果sessionID正确就放行
            if(sessionSaveId.equals(sessionId)){
                return true;
            }
        }

        //否则就跳转到登陆页面
        request.getRequestDispatcher("/views/login.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
