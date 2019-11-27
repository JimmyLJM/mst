package com.prc.Test;

import com.prc.java8Learn.dto.Apple;

public class Test {
    public static void main(String[] args){
        Apple p = new Apple();
        p.setColor("red");
        System.out.println(p.getColor());
        Thread t = new Thread(new Runnable(){
            public void run(){
                ThreadLocal<Apple> threadLocal = new ThreadLocal<>();
                System.out.println(threadLocal);
                threadLocal.set(p);
                System.out.println(threadLocal.get());
                threadLocal.remove();
//                try {
//                    //threadLocal.set((Apple) p.clone());
//                    threadLocal.set(p);
//                    System.out.println(threadLocal.get());
//                } catch (CloneNotSupportedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(threadLocal);
            }});
        t.start();
    }
}
