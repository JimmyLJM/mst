package com.prc.threadDemo1.forkJoinPrc;

import java.util.concurrent.*;

/**
 * fork/join demo
 *  需要继承一个forkJoinTask子类  RecursiveTask<T>,RecursiveAction
 *  重写compute方法.
 *
 *
 *
 */
public class CountTask extends RecursiveTask<Integer> {

    private static final int THREAD_HOLD = 2;

    private int start;
    private int end;

    public CountTask(int start,int end){
        this.start = start;
        this.end = end;
    }

    /**
     *  重写 compute方法
     * @return
     */
    @Override
    protected Integer compute() {
        int sum = 0;
        //如果任务足够小就计算
        boolean canCompute = (end - start) <= THREAD_HOLD;
        if(canCompute){
            for(int i=start;i<=end;i++){
                sum += i;
            }
        }else{
            // 拆解任务的时候需要注意，此处是使用了递归的方式。如果拆解任务不当则会产生死循环出产生java.lang.StackOverflowError
            int middle = (start + end) / 2;
            CountTask left = new CountTask(start,middle);
            CountTask right = new CountTask(middle+1,end);
            //执行子任务
            left.fork();
            right.fork();
            //获取子任务结果
            int lResult = left.join();
            int rResult = right.join();
            sum = lResult + rResult;
        }
        return sum;
    }

    /**
     *  调用方法
     *      创建 ForkJoinPool 实例，和ForkJoinTask.
     *      通过 ForkJoinPool.submit或者ForkJoinPool.excute将和ForkJoinTask执行
     * @param args
     */
    public static void main(String[] args){
        ForkJoinPool pool = new ForkJoinPool();
        CountTask task = new CountTask(1,1000000);
        Future<Integer> result = pool.submit(task);

        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
