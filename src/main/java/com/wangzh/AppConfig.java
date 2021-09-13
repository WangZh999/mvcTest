package com.wangzh;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan("com.wangzh")
public class AppConfig {
}
