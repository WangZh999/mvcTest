package com.wangzh.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    public BeanB() {
        System.out.println("BeanB ---> " + this);
    }
}
