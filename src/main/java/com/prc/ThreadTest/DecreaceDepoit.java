package com.prc.ThreadTest;

import com.alibaba.fastjson.JSONObject;

/**
 *  取款线程
 */
public class DecreaceDepoit extends Thread{

    private Deposit deposit;

    public DecreaceDepoit(Deposit deposit) {
        this.deposit = deposit;
    }

    @Override
    public void run() {
        deposit.setMoney(deposit.getMoney() - 1L);
        System.out.println("DecreaceDepoit --- " + JSONObject.toJSONString(deposit));
    }
}
