package com.test.proxy.serviceImpl;

import com.test.proxy.service.MoveAble;

public class CarFirst implements MoveAble {
    public void move() throws InterruptedException {
        System.out.println("汽车启动。。。。。");
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("汽车行驶:" + (endTime - startTime) + "毫秒");
    }
}
