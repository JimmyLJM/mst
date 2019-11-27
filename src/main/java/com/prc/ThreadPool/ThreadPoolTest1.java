package com.prc.ThreadPool;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

/**
 *  Executors获取线程池
 *  由于以上方法的缺陷，在生产复杂的环境下，我们无法控制业务的提交，造成内存溢出，CPU 100%
 *  一般不推荐使用Executors工具类，推荐直接使用ThreadPoolExecutor自己调参数。
 */
public class ThreadPoolTest1 {

    public static void main(String[] args) {

        // LinkedBlockingQueue
        ExecutorService ex1 = Executors.newFixedThreadPool(5);
        for (int i=0;i<10;i++){
            ex1.execute(()-> System.out.println(Thread.currentThread().getName()));
        }

        ex1.shutdown();

        // SynchronousQueue
        ExecutorService ex2 = Executors.newCachedThreadPool();
        for (int i=0;i<10;i++){
            ex2.execute(()-> System.out.println(Thread.currentThread().getName()));
        }

        ex2.shutdown();

        // 单线程
        ExecutorService ex3 = Executors.newSingleThreadExecutor();
        for (int i=0;i<10;i++){
            ex3.execute(()-> System.out.println(Thread.currentThread().getName()));
        }

        ex3.shutdown();


        // 获取有返回值的
        ExecutorService ex4 = Executors.newFixedThreadPool(5);
        List<Future<String>> list = new LinkedList<>();
        for (int i=0;i<10;i++){
            Future<String> future = ex1.submit((Callable) () -> Thread.currentThread().getName());
            list.add(future);
        }

        list.stream().forEach((s)-> {
            try {
                System.out.println(s.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        ex1.shutdown();
    }
}
