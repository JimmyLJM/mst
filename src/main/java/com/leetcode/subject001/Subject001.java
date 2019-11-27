package com.leetcode.subject001;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 我们提供了一个类：
 *
 * public class Foo {
 *   public void one() { print("one"); }
 *   public void two() { print("two"); }
 *   public void three() { print("three"); }
 * }
 * 三个不同的线程将会共用一个 Foo 实例。
 *
 * 线程 A 将会调用 one() 方法
 * 线程 B 将会调用 two() 方法
 * 线程 C 将会调用 three() 方法
 * 请设计修改程序，以确保 two() 方法在 one() 方法之后被执行，three() 方法在 two() 方法之后被执行。
 */
public class Subject001 {

    public static void main(String[] args) {

        // plan1
        Subject001 s1 = new Subject001();
        s1.plan1();


    }


    /***********************************************
     *   方案一：使用volatile关键字来实现同步
     * *********************************************/
    private volatile int state = 1;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void plan1(){

        new Thread(()->{
            while(this.getState() == 1) {
                System.out.println("one");
                this.setState(2);
                break;
            }
        }).run();

        new Thread(()->{
            while(this.getState() == 2) {
                System.out.println("tow");
                this.setState(3);
                break;
            }
        }).run();

        new Thread(()->{
            while(this.getState() == 3) {
                System.out.println("three");
                break;
            }
        }).run();

    }


    /***********************************************
     *   方案二：ReentrantLock锁结合Condition
     *   创建3给Condition用来唤醒
     * *********************************************/
    ReentrantLock lock = new ReentrantLock();
    Condition firstCondition = lock.newCondition();
    Condition secondCondition = lock.newCondition();
    Condition thirdCondition = lock.newCondition();

    public void plan2(){
        try{
            lock.lock();

        }catch (Exception e){


        }


//        new Thread(()->{
//            try{
//                lock.lock();
//                if(state!=1){
//                    firstCondition.await();
//                }
//                state = 2;
//                printFirst.run();
//                secondCondition.signal();
//
//            }catch (Exception e){
//                lock.unlock();
//            }
//        }).run();
//
//        new Thread(()->{
//            while(this.getNum() == 2) {
//                System.out.println("tow");
//                this.setNum(3);
//                break;
//            }
//        }).run();
//
//        new Thread(()->{
//            while(this.getNum() == 3) {
//                System.out.println("three");
//                break;
//            }
//        }).run();


    }












}
