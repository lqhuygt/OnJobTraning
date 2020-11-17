package com.java1906.demointerceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
    @GetMapping("/getSomethingNeedAuthenticated")
    public String doCheckLogin() {
        return "You're login successed and getting this data";
    }
}
