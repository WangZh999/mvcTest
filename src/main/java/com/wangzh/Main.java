package com.wangzh;


import com.wangzh.bean.BeanA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Object beanA = context.getBean("beanA");
        ((BeanA) beanA).pointCut();
        LOGGER.info("main   " + beanA.getClass());
    }

}
