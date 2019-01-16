package com.test.proxy.testClass;

import com.test.proxy.serviceImpl.CarFirst;
import com.test.proxy.serviceImpl.CarLogProxy;
import com.test.proxy.serviceImpl.CarTimeProxy;

//测试静态代理中的继承代理和聚合代理
//其中聚合代理比继承代理更适合做静态代理
public class CarTestExtendProxy {

    public static void main(String[] args) throws InterruptedException {
        CarFirst carFirst = new CarFirst();
        CarTimeProxy carTimeProxy = new CarTimeProxy(carFirst);
        CarLogProxy carThird = new CarLogProxy(carTimeProxy);
        carThird.move();
    }


}
