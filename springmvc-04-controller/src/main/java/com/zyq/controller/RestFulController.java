package com.zyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    // 原格式:http://localhost:8080/springmvc_04_controller_war_exploded/add?a=1&b=2
    // RestFul: http://localhost:8080/springmvc_04_controller_war_exploded/add/1/2

    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
    public String test1(@PathVariable int a,@PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为: " + res);
        return "test";
    }

    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果2为: " + res);
        return "test";
    }
}
