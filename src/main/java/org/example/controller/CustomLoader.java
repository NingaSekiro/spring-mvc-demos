package org.example.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class CustomLoader implements ServletContextListener {

    private WebApplicationContext applicationContext;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 初始化Spring ApplicationContext
        applicationContext = new XmlWebApplicationContext();
        ((XmlWebApplicationContext) applicationContext).setConfigLocation("classpath:spring/*.xml");
        ((XmlWebApplicationContext) applicationContext).refresh();
        ServletContext servletContext = sce.getServletContext();
//        servletContext.setAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE, this.applicationContext);

        // 在这里可以执行一些初始化操作，如果需要的话
        // 例如：获取从Spring容器中注入的bean，执行一些初始化逻辑
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 在Web应用关闭时，可以执行一些清理操作
        // 例如：释放资源、关闭数据库连接等
    }

}
