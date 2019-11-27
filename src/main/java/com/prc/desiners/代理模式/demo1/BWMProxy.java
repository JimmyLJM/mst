package com.prc.desiners.代理模式.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName BWMProxy
 * @Description TODO
 * @Author JiaMingLiang
 * @Date 2019/11/22 16:19
 * @Version 1.0
 *  宝马车代理类
 */
public class BWMProxy implements InvocationHandler {

    // 持有被代理对象
    private BWM bwm;

    // 构造中加入设置
    public BWMProxy(BWM bwm) {
        this.bwm = bwm;
    }

    /**
     * @param proxy   代理类对象
     * @param method  被代理的方法
     * @param args     被代理方法的参数列表
     * @return
     * @throws Throwable
     *
     *   重写invoke方法，执行method前调用before(),执行后调用after()
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        //zhangSan.eat();
        Object result = method.invoke(bwm, args);//可以获取目标方法的返回值
        after();
        return null;
    }


    private void before() {
        System.out.println("拿钥匙启动");
    }
    private void after() {
        System.out.println("拔出钥匙");
    }


}
