package com.prc.ThreadTest;

public class ThreadA extends Thread{

    private int num;

    public ThreadA(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(num);
    }


}
