package org.example.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

import static org.example.servlet.MyServlet.requestThreadLocal;

@Aspect
@Component
public class OperationLogAspect {
    @Pointcut("@annotation(org.example.annotation.OperationLog)")
    public void operationLog() {
    }

    @Around("operationLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpServletRequest request = requestThreadLocal.get();
        long beginTime = System.currentTimeMillis();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        OperationLog annotation = signature.getMethod().getAnnotation(OperationLog.class);
        // 执行方法
        Object result = joinPoint.proceed();

        // 执行时长
        long time = System.currentTimeMillis() - beginTime;
        // ...获取请求中的信息，并结合注解中的信息生成日志...
        System.out.println(annotation.value() + "sadasdas" + annotation.type());
        return result;
    }

    @AfterThrowing(pointcut = "operationLog()", throwing = "e")
    public void doAfterThrowing(JoinPoint joinPoint, Throwable e) {
        // ...获取请求中的信息，并结合注解中的信息和异常信息生成日志...
        System.out.println(e.getMessage());
    }
}