package com.wangzh;

import com.wangzh.bean.BeanB;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization 2:   " + beanName + "   " + bean.getClass());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization 2:    " + beanName + "   " + bean.getClass());
        if ("beanA".equals(beanName)) {
            System.out.println("beanA.equals(beanName)");
//            Object o = new BeanB();
//            System.out.println(o);
            StackTraceElement[] elements = Thread.currentThread().getStackTrace();
            for (StackTraceElement element : elements) {
                System.out.println(element);
            }
        }
        return bean;
    }
}
