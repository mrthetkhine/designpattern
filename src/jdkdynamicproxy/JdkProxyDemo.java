/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdkdynamicproxy;

import java.lang.reflect.Proxy;

/**
 *
 * @author Mr T.Khine
 */
public class JdkProxyDemo {
    public static void main(String[] args) {
        BusinessLogic foo = (BusinessLogic)Proxy.newProxyInstance(JdkProxyDemo.class.getClassLoader(),
                                         new Class[] { BusinessLogic.class },new MyDynamicProxy(new SaleBusiness()));
        foo.doAction();
    }
}
