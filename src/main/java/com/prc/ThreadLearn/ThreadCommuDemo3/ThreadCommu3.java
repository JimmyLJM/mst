package com.prc.ThreadLearn.ThreadCommuDemo3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 *  有两个线程A、B，A线程向一个集合里面依次添加元素"abc"字符串，
 *  一共添加十次，当添加到第五次的时候，希望B线程能够收到A线程的通知，然后B线程执行相关的业务操作
 *
 *  方式三：使用JUC工具类 CountDownLatch
 */
public class ThreadCommu3 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        List<String>  list = new ArrayList<>();
        // 实现线程A
        Thread threadA = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                list.add("abc");
                System.out.println("线程A向list中添加一个元素，此时list中的元素个数为：" + list.size());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (list.size() == 5)
                    countDownLatch.countDown();
            }
        });
        // 实现线程B
        Thread threadB = new Thread(() -> {
            while (true) {
                if (list.size() != 5) {
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程B收到通知，开始执行自己的业务...");
                break;
            }
        });
        //　需要先启动线程B
        threadB.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 再启动线程A
        threadA.start();
    }
}
