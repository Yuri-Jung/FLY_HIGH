package com.fly.flyhigh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping("/")
    public String index() throws Exception {
        return "index";
    }

    @RequestMapping("/header")
    public String header() throws Exception {
        return "header";
    }
    @RequestMapping("/footer")
    public String footer() throws Exception {
        return "footer";
    }

    @RequestMapping("/login")
    public String login() throws Exception {
        return "login";
    }

    @RequestMapping("/main")
    public String main() throws Exception {
        return "main";
    }

    @RequestMapping("signUp")
    public String register() throws Exception {
        return "signUp";
    }
}
