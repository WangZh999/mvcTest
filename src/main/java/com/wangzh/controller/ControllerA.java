package com.wangzh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {
    private final static Logger LOGGER = LoggerFactory.getLogger(ControllerA.class);

    @RequestMapping("/test")
    public String test() {
        LOGGER.info("enter test");
        return "Hello";
    }
}
