package com.prc.threadDemo1.threadExCatch;

public class ThreadExCatchPrc implements Runnable {

    public static class ChildThreadExceptionHandler implements Thread.UncaughtExceptionHandler {
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(String.format("handle exception in child thread. %s", e));
        }
    }

    private static ChildThreadExceptionHandler exceptionHandler;

    static {
        exceptionHandler = new ChildThreadExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(exceptionHandler);
    }

    public void run() {
        System.out.println("do something 1");
        exceptionMethod();
        System.out.println("do something 2");
    }

    private void exceptionMethod() {
        throw new RuntimeException("ChildThread exception");
    }
}
