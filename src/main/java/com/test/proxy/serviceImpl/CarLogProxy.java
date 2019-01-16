package com.test.proxy.serviceImpl;

import com.test.proxy.service.MoveAble;

public class CarLogProxy implements MoveAble {

    private MoveAble moveAble;

    public CarLogProxy(MoveAble moveAble) {
        this.moveAble = moveAble;
    }

    public void move() throws InterruptedException {
        System.out.println("打开日志。。。。");
        moveAble.move();
        System.out.println("关闭日志。。。");
    }
}
