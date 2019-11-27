package com.prc.Test;

import java.util.concurrent.ArrayBlockingQueue;

public class TestCLH {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<String>(10);

        abq.add("a1");
        abq.add("a2");
        abq.add("a3");
        abq.add("a4");
        abq.add("a5");
        abq.add("a6");

        System.out.println(abq);

        String A  = abq.peek();
        System.out.println(abq);
        String B = abq.poll();
        System.out.println(abq + "B:"+B + " A:"+A);
        abq.remove("a6");
        System.out.println(abq);
    }

}
