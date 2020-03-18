package com.zyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ModelTest1 {
    @RequestMapping("/m1/t1")
    public String test(Model model) {
        model.addAttribute("msg", "ModelTest");
        return "/WEB-INF/jsp/test.jsp";
    }
}
