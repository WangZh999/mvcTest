package com.wangzh.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Aspect
@Component
public class AopA {


    @Before("execution(public void com.wangzh.bean.*.pointCut(..))")
    public void beforeTest() {
        System.out.println("beforeTest");
        System.out.println(this);
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.out.println(element);
        }
    }
}
