package com.wangzh.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanA implements InitializingBean {
    @Autowired
    BeanB beanA;

    public BeanA() {
        System.out.println("BeanA ---> " + this);
    }


    @PostConstruct
    void post() {
        System.out.println("PostConstruct");
//        System.out.println(beanA.getClass());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");

    }

    public void pointCut() {
        System.out.println("pointCut----");

        System.out.println(this);
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.out.println(element);
        }
        System.out.println("pointCut----");
    }

//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("postProcessBeforeInitialization:   " + beanName + "   " + bean.getClass());
//        return null;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("postProcessAfterInitialization");
//        return null;
//    }
}
