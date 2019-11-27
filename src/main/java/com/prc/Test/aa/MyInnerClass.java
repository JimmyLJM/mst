package com.prc.Test.aa;

public class MyInnerClass {

    static {
        System.out.println("load outer class...");
    }

    //静态内部类
    static class StaticInner {
        static {
            System.out.println("load static inner class...");
        }

        static void staticInnerMethod() {
            System.out.println("static inner method...");
        }
    }

    public static void main(String[] args) {
        MyInnerClass outer = new MyInnerClass();      //此刻其内部类是否也会被加载？
        System.out.println("===========分割线===========");
        MyInnerClass.StaticInner.staticInnerMethod();      //调用内部类的静态方法
    }
}
