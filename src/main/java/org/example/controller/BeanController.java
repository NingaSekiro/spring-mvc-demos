package org.example.controller;

import org.example.annotation.OperationLog;
import org.example.model.User;
import org.example.service.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@RestController
public class BeanController {

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
    public User test() {
        User user = new User();
        user.setName("sadasd");
        user.setAge(18);
        return user;
    }

    @PostMapping(value = "/user")
    public String user(@RequestBody User user, BindingResult bindingResult) {
        return user.toString();
    }

    public String convert(String name) {
        return "Hello " + name;
    }
}