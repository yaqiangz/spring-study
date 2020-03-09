package com.zyq.demo04self;

import com.zyq.demo02.UserService;
import com.zyq.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setObject(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
    }
}
