package com.test.jdkProxy.testClass;

import com.test.jdkProxy.proxyClass.TimeHandler;
import com.test.jdkProxy.service.MoveAble;
import com.test.jdkProxy.serviceImpl.Car;

import java.lang.reflect.Proxy;


public class TestJdkProxy {


    public static void main(String[] args) {
//        Car car = new Car();
//        TimeHandler timeHandler = new TimeHandler(car);
//        Class tClass = car.getClass();
//        MoveAble moveAble = (MoveAble) Proxy.newProxyInstance(tClass.getClassLoader(), tClass.getInterfaces(), timeHandler);
//        moveAble.move();

        System.out.println("111111");
    }

}
