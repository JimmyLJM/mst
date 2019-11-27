package com.prc.ThreadLearn.demo2;

/**
 * 实现Runnable接口创建线程
 */
public class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("实现Runnable接口创建线程"+ this.getName());
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyThread2(String name) {
        this.name = name;
    }

    // Test
    public static void main(String[] args) {

        // 启动线程需要使用Thread参数为Runnable接口的构造方法
        Thread t1 = new Thread(new MyThread2("A"));
        t1.start();
        Thread t2 = new Thread(new MyThread2("B"));
        t2.start();
    }
}
