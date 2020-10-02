package com.jie.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class AnnotationPointcut {
    @Before("execution(* com.jie.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("======执行方法前=======");
    }
    @After("execution( * com.jie.service.UserServiceImpl.*(..))")
    public  void after(){
        System.out.println("======执行方法后========");
    }
    @Around("execution(* com.jie.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp ) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名："+jp.getSignature());
        //执行了目标方法proceed
        Object proceed =jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);


    }
}
