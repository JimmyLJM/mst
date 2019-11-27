package com.prc.threadDemo1.threadPoolPrc;

import java.util.concurrent.*;

/**
 * 线程池使用练习
 *
 *
 */
public class ThreadPoolPrc {

    public static void main(String[] args) {

        // 验证是否是单例
        ThreadPoolExecutor t1 = ThreadPoolUtil.getThreadPool();
        ThreadPoolExecutor t2 = ThreadPoolUtil.getThreadPool();
        System.out.println(t1.equals(t2));

        ThreadPoolUtil.execute(() ->{
            System.out.println("1");
        });


        ThreadPoolPrc tp1 = new ThreadPoolPrc();
        tp1.ExecutorProduce();

    }

    //  Executors  获取线程池
    public void ExecutorProduce(){
        // 没有额外线程，只存在核心线程，而且核心线程没有超时机制，而且任务队列没有长度的限制
        ExecutorService pool = Executors.newFixedThreadPool(5);

        for (int i =1; i<=20; i++){
            final int index=i ;
            pool.execute(new Runnable(){
                @Override
                public void run() {
                    try {
                        System.out.println("第" +index + "个线程" +Thread.currentThread().getName());
                        Thread.sleep(1000);
                    } catch(InterruptedException e ) {
                        e .printStackTrace();
                    }
                }

            });
        }
        // 线程池关闭
        pool.shutdown();


        // ScheduledThreadPool
        ScheduledExecutorService scheduledThreadPool= Executors.newScheduledThreadPool(3);
        scheduledThreadPool.scheduleAtFixedRate(new Runnable(){
            @Override
            public void run() {
                System.out.println("延迟1秒后每三秒执行一次");
            }
        },1,3,TimeUnit.SECONDS);

        scheduledThreadPool.shutdown();
    }
}
