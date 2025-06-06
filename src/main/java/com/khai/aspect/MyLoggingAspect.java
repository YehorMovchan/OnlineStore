package com.khai.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyLoggingAspect {

    @Around("execution(* com.khai.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint pjp) throws Throwable
    {
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        String methodName = methodSignature.getName();

        Object target = pjp.proceed();
        return target;
    }
}
