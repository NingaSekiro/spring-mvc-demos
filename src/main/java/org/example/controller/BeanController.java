package demo.spring.aspect.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BeanController extends BaseController {

    @GetMapping("/beanList")
    public String beanList() {
        System.out.println("sssssss");
        return "sdasd";
//        return Arrays.asList(applicationContext.getBeanDefinitionNames());
//        Map<String, Object> dataMap = new HashMap<String, Object>();
//        dataMap.put("start", "start");
//        renderString(response, dataMap.toString(), "text/json");
    }
}