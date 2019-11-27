package com.prc.desiners.代理模式.demo1;

/**
 * @ClassName BWM
 * @Description TODO
 * @Author JiaMingLiang
 * @Date 2019/11/22 16:17
 * @Version 1.0
 *
 *  宝马车
 */
public class BWM implements Car{

    @Override
    public void run() {
        System.out.println("BWM 开到了90迈。。。");
    }

    @Override
    public void wiat() {
        System.out.println("BWM 等红灯");
    }

    @Override
    public void stop() {
        System.out.println("BWM 停车");
    }

    @Override
    public void turnaRound() {
        System.out.println("BWM  转弯");
    }
}
