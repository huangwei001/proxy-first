package com.test.jdkProxy.proxyClass;

import javax.jws.Oneway;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

    private Object object;

    public TimeHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("打开车门。。。。");
        method.invoke(proxy);
        Thread.sleep(10000);
        System.out.println("关闭车门。。。");
        return null;
    }
}
