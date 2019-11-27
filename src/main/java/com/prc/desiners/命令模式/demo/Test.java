package com.prc.desiners.命令模式.demo;

/**
 * 命令模式
 *    调用命令客户端
 */
public class Test {

    public static void main(String[] args) {
        Command cmd=new ConcreteCommand();
        Invoker ir=new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}
