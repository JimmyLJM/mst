package com.prc.ThreadTest;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest {

    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(0);

        for (int i=0;i<100;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    a.incrementAndGet();
                    System.out.println(a);
                }
            }).start();
        }

    }
}
