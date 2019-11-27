package com.prc.threadDemo1.threadPoolPrc;

import java.util.concurrent.*;


/**
 * 自定义线程池工具类
 */
public class ThreadPoolUtil {

    /* 私有化构造方法 */
    private ThreadPoolUtil() {super();}


    //**************** 线程池参数 ***************************//

    // 核心线程池数
    private final static Integer COREPOOLSIZE = 2;
    // 最大线程数数量
    private final static Integer MAXIMUMPOOLSIZE = 4;
    // 线程存活时间
    private final static Integer KEEPALIVETIME = 60;
    // 时间单位秒
    private final static TimeUnit unit = TimeUnit.SECONDS;
    // 是否允许核心线程超时，默认为false
    private final static boolean ALLOWCORETHREADTIMEOUT = false;
    // 线程等待队列
    private static BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(10);

    // 验证是否单例使用
    public static ThreadPoolExecutor getThreadPool() {
        return threadPool;
    }

    // 线程池对象，使用static保证调用的是同一个线程池实例
    private static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(COREPOOLSIZE, MAXIMUMPOOLSIZE,
            KEEPALIVETIME, unit, queue, new ThreadPoolExecutor.AbortPolicy());

    static {
        threadPool.allowCoreThreadTimeOut(ALLOWCORETHREADTIMEOUT);
    }

    //********************  对外提供方法  ***********************//

    /**
     * 返回future值用来获取调用线程池返回的结果
     * @param c  Callable接口实现类实例
     * @return
     */
    public static Future<?> submit(Callable<?> c) {
        return threadPool.submit(c);
    }

    /**
     * 不关心返回结果
     * @param r
     */
    public static void execute(Runnable r) {
        threadPool.execute(r);
    }

    /**
     * 获取当前线程池线程数量
     * @return
     */
    public static int getSize() {
        return threadPool.getPoolSize();
    }

    /**
     * 获取当前活动的线程数量
     * @return
     */
    public static int getActiveCount() {
        return threadPool.getActiveCount();
    }

}
