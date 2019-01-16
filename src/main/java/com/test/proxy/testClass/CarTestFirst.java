package com.test.proxy.testClass;

import com.test.proxy.service.MoveAble;
import com.test.proxy.serviceImpl.CarFirst;
import com.test.proxy.serviceImpl.CarSecond;
import com.test.proxy.serviceImpl.CarThird;
//测试静态代理的两种方式
//1.继承代理
//2.聚合代理
public class CarTestFirst {

    public static void main(String[] args) throws InterruptedException {
//        MoveAble moveAble = new CarSecond();
//        moveAble.move();
        CarFirst carFirst = new CarFirst();
        CarThird carThird =  new CarThird(carFirst);
        carThird.move();
    }

}
