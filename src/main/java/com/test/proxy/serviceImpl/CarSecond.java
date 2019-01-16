package com.test.proxy.serviceImpl;

public class CarSecond extends CarFirst{
    @Override
    public void move() throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println("打开车门");
        super.move();
        Thread.sleep(10001);
        System.out.println("下车关闭车门");
        long end = System.currentTimeMillis();
        System.out.println("共耗时:" + (end - start) + "毫秒");
    }
}
