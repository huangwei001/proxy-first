package com.test.proxy.serviceImpl;

public class CarThird{

    private CarFirst carFirst;

    public CarThird(CarFirst carFirst) {
        this.carFirst = carFirst;
    }

    public void move() throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println("打开车门");
        Thread.sleep(5000);
        carFirst.move();
        System.out.println("下车关闭车门");
        long end = System.currentTimeMillis();
        System.out.println("共耗时:" + (end - start) + "毫秒");
    }
}
