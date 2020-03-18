package com.zyq.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zyq.pojo.User;
import com.zyq.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody // 加了该注解, 就不会走试图解析器, 会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        // jackson, ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("小明", 5, "男");
        System.out.println("-----------------------------");
        String str = mapper.writeValueAsString(user);
        return str;
    }


    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<User> userList = new ArrayList<User>();
        User user = new User("小明", 5, "男");
        User user1 = new User("小明1", 5, "男");
        User user2 = new User("小明2", 5, "男");
        User user3 = new User("小明3", 5, "男");
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return JsonUtils.getJson(userList);
    }

    @RequestMapping("/j3")
    @ResponseBody
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date, "yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping("/j4")
    @ResponseBody
    public String json4() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        User user = new User("小明", 5, "男");
        User user1 = new User("小明1", 5, "男");
        User user2 = new User("小明2", 5, "男");
        User user3 = new User("小明3", 5, "男");
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        return JSON.toJSONString(userList);
    }
}
