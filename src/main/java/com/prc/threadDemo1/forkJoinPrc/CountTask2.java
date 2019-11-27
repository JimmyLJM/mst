package com.prc.threadDemo1.forkJoinPrc;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class CountTask2 extends RecursiveTask<Integer> {

    private static final Integer THRESHOLD = 1000;
    private int start;
    private int end;
    public CountTask2(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        Integer sum = 0;
        boolean isOk = end - start <= THRESHOLD;
        if(isOk) {
            for(int i = start; i <= end; i ++) {
                sum += i;
            }
//            System.out.println(String.format("compute %d-%d = %d", start, end, sum));
            return sum;
        }

        //除以2
        int middle = (end + start) / 2;
        //子任务递归
//        System.out.println(String.format("fork %d-%d => %d-%d&%d-%d", start, end, start, middle - 1, middle, end));
        CountTask2 sumSubTask = new CountTask2(start, middle - 1);
        CountTask2 sumSubTask1 = new CountTask2(middle, end);

        // fork子任务
        invokeAll(sumSubTask, sumSubTask1);

        //join子任务
        Integer join = sumSubTask.join();
        Integer join1 = sumSubTask1.join();

        sum = join + join1;
        //计算结果
        return sum;
    }

    /**
     * 使用 ForkJoinPool 的invoke方法来启动任务
     * @param args
     */
    public static void main(String[] args) {
        int start = 1;
        int end = 1000000;

        ForkJoinPool fjp2 = new ForkJoinPool();
        CountTask2 sumTask2 = new CountTask2(start, end);
        long begin3 = System.currentTimeMillis();
        Integer invoke = fjp2.invoke(sumTask2);
        long end3 = System.currentTimeMillis();
        System.out.println("invokeAll 结果为 sum = " + invoke + ",计算时长为" + begin3 + "-" + end3 + "---  " + (end3 - begin3) + "ms");
    }


}
