/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author Mr T.Khine
 */
public class MyDynamicProxy implements InvocationHandler{

    Object target;

    public MyDynamicProxy(Object target) {
        this.target = target;
    }

    
    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
    
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Intercept before method cal");
        Object ret = method.invoke(target, args);
        System.out.println("After method call");
        return ret;
    }
    
}
