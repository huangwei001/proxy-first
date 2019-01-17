package com.test.jdkProxy.serviceImpl;

import com.test.jdkProxy.service.MoveAble;

public class Car implements MoveAble {
    @Override
    public void move() {
        System.out.println("汽车行驶");
    }
}
