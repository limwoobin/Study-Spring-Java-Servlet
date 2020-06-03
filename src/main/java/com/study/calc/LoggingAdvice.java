package com.study.calc;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("메소드 호출전:" + methodInvocation);
        System.out.println(methodInvocation.getMethod() + "메서드 호출 전");

        Object object = methodInvocation.proceed();

        System.out.println("메소드 호출후:");
        System.out.println(methodInvocation.getMethod() + "메소드 호출 후..");
        return object;
    }
}
