package org.example.controller;

import com.alibaba.fastjson.JSON;
import org.example.annotation.OperationLog;
import org.example.exception.BaseRuntimeException;
import org.example.model.User;
import org.example.service.BeanService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class BeanController implements ApplicationContextAware {

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private BeanService beanService;


    @GetMapping("/beanList")
    @OperationLog(type = "{convert('sdsadasd')}")
    public String beanList() {
        return beanService.convert("sadasd");
//        throw new BaseRuntimeException("sdasdas");
//        return JSON.toJSONString(applicationContext.getBeanDefinitionNames());
    }

    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }

    @GetMapping(value = "/user")
    public String user(@Valid User user, BindingResult bindingResult) {
        return user.toString();
    }
    public String convert(String name) {
        return "Hello " + name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("controller"+applicationContext);
    }
}