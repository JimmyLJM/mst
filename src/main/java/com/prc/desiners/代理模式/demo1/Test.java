package com.prc.desiners.代理模式.demo1;

import java.lang.reflect.Proxy;

/**
 * @ClassName Test
 * @Description TODO
 * @Author JiaMingLiang
 * @Date 2019/11/22 16:26
 * @Version 1.0
 *
 *  java代理测试
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("----------------------JDK动态代理----------------------------");
        //获取代理类对象
        Car proxyInstance = (Car)Proxy.newProxyInstance(Car.class.getClassLoader(),
                new Class[] {Car.class}, new BWMProxy(new BWM()));
        proxyInstance.stop();
    }
}
