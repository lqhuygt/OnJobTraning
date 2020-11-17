package com.java1906.demointerceptor.controller;

import com.java1906.demointerceptor.utils.TokenManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
@ResponseBody
public class LoginController {

    @Autowired
    private TokenManager tokenManager;

    @RequestMapping("/doLogin")
    public String doLogin(
            HttpServletRequest request,
            @RequestParam("username") String username,
            @RequestParam("password") String password) {
        if (username.equals("Casper") && password.equals("1111")) {
            String token =  tokenManager.createToken(request.getSession().getId());
            request.getSession().setAttribute("AuthToken", token);
            return "success";
        } else {
            request.getSession().setAttribute("AuthToken", null);
            return "error";
        }

    }
}
