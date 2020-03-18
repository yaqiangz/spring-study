package com.zyq.controller;

import com.zyq.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// 不经过视图解析器
@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test() {
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1: param => " + name);
        if (name.equals("lala"))
            response.getWriter().print("true");
        else
            response.getWriter().print("false");
    }

    @RequestMapping("/a2")
    public List<User> a2() {
        ArrayList<User> usersList = new ArrayList<>();

        usersList.add(new User("小明", 1, "男"));
        usersList.add(new User("小李", 1, "女"));
        usersList.add(new User("张三", 1, "男"));
        return usersList;
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd) {
        String msg = "";
        if (name != null)
            if ("admin".equals(name))
                msg = "ok";
            else
                msg = "用户名有误";
        if (pwd != null)
            if ("123456".equals(pwd))
                msg = "ok";
            else
                msg = "密码有误";
        return msg;    
    }
}
