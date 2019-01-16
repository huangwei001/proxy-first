package com.test.proxy.serviceImpl;

import com.test.proxy.service.MoveAble;

public class CarTimeProxy implements MoveAble {

    private MoveAble moveAble;

    public CarTimeProxy(MoveAble moveAble) {
        this.moveAble = moveAble;
    }

    public void move() throws InterruptedException {
        long start = System.currentTimeMillis();
        moveAble.move();
        long end = System.currentTimeMillis();
        System.out.println("耗时" + (end - start) + "毫秒");
    }
}
