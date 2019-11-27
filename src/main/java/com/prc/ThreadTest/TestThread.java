package com.prc.ThreadTest;

public class TestThread {

    private int value = 20; // 20张票

    public static void main(String[] args) {

        /*Runnable runnable = new Runnable() {
            Count count = new Count();
            public void run() {
                count.count();
            }
        };

        for(int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }*/

        TestThread t =  new TestThread();

        new Thread(() -> {
            while (true) {
                System.out.println("用户" + Thread.currentThread().getName() + "买了票还剩余" + t.increamentAndGet() + "张票");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "张三").start();
        new Thread(() -> {
            while (true) {
                System.out.println("用户" + Thread.currentThread().getName() + "买了票还剩余" + t.increamentAndGet() + "张票");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "王五").start();
        new Thread(() -> {
            while (true) {
                System.out.println("用户" + Thread.currentThread().getName() + "买了票还剩余" + t.increamentAndGet() + "张票");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "李四").start();
    }

    //synchronized
    public synchronized  int increamentAndGet() {
        synchronized (TestThread.class){
            if (value == 0){
                return 0;
            }
            return value--;
        }
    }
}
