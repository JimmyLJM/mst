package com.prc.ThreadTest;

import com.alibaba.fastjson.JSONObject;

/**
 *  存款线程
 */
public class IncreaceDeposit extends Thread{

    private Deposit deposit;

    public IncreaceDeposit(Deposit deposit) {
        this.deposit = deposit;
    }

    @Override
    public void run() {
        deposit.setMoney(deposit.getMoney() + 1L);
        System.out.println("Increac ----" + JSONObject.toJSONString(deposit));
    }
}
