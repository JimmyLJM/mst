package com.prc.ThreadLearn.TreadCommuDeom2;

import java.util.ArrayList;
import java.util.List;

/**
 *  有两个线程A、B，A线程向一个集合里面依次添加元素"abc"字符串，
 *  一共添加十次，当添加到第五次的时候，希望B线程能够收到A线程的通知，然后B线程执行相关的业务操作
 *
 *  方式二：使用Object类的wait() 和 notify() 方法
 */
public class TreadCommu2 {

    public static void main(String[] args) {

        // 定义一个锁对象
        Object lock = new Object();
        List<String> list = new ArrayList<>();



        // 线程B
        new Thread(()->{
            while (true) {
                System.out.println("线程B在执行list.size() " + list.size() );
                synchronized (lock) {
                    if (list.size() != 5) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("线程B收到通知，开始执行自己的业务...");
                }
            }
        },"B").start();


        // 线程A
        new Thread(()->{
            synchronized (lock){
                for(int i=0;i<10;i++){
                    list.add("abc");
                    System.out.println(Thread.currentThread() + "增加元素后list大小" + list.size());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (list.size() == 5)
                        lock.notifyAll();// 唤醒B线程
                }
            }
        },"A").start();
    }

}
