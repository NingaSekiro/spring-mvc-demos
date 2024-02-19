package org.example.controller;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.context.WebApplicationContext;

public class CustomDispatcherServlet extends DispatcherServlet {
    @Override
    protected WebApplicationContext initWebApplicationContext() {
        // 初始化Spring ApplicationContext
        WebApplicationContext rootContext = getWebApplicationContext();

        // 返回ApplicationContext，供DispatcherServlet使用
        return super.initWebApplicationContext();
    }
}
