package com.prc.ThreadLearn.demo6;

import java.util.Arrays;
import java.util.List;

/**
 *  Lambda表达式的实现
 */
public class MyThread6 {

    public static void main(String[] args) {

        /*
          实际上也是使用了匿名内部类的方式
         */
        new Thread(() -> {
            while (true) {
                System.out.println("用户" + Thread.currentThread().getName() + "买了票还剩余张票");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "张三").start();


        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        MyThread6 t = new MyThread6();
        int result = t.add(list);
        System.out.println("计算后的结果为"+result);

    }

    public int add(List<Integer> list) {
        /*
            若Lambda是串行执行,则应顺序打印
         */
        list.parallelStream().forEach(System.out :: println);
        //Lambda有stream和parallelSteam(并行)
        return list.parallelStream().mapToInt(i -> i).sum();
    }
}
