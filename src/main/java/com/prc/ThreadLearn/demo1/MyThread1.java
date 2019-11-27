package com.prc.ThreadLearn.demo1;

/**
 * 继承Thread类，重写run()方法
 */
public class MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println("继承Thread类，重写run()方法,实现线程类创建,创建线程"+ getName());
    }

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread1 t2 = new MyThread1();
        t2.start();
    }
}
