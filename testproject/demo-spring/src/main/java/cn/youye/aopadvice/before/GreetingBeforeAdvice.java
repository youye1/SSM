package cn.youye.aopadvice.before;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 3.增强实现
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        String clientName= (String) objects[0];
        System.out.println("How are you Mr."+clientName);
    }
}
