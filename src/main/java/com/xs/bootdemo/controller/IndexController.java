package com.xs.bootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    /**
     * 默认启动页设置
     * @return
     */
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }


}
