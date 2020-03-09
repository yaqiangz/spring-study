package com.zyq.diy;
// 方式三: 使用注解实现AoP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // 标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.zyq.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=====方法执行前=======");
    }

    @After("execution(* com.zyq.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=====方法执行后=======");
    }

    // 在环绕增强中, 可以给定一个参数, 代表要获处理切入的点
    @Around("execution(* com.zyq.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        // 执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
    }
}
