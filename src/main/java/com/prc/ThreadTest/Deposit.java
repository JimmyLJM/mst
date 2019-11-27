package com.prc.ThreadTest;

public class Deposit {
    private Long money;
    private String currency;

    public Deposit(Long money, String currency) {
        this.money = money;
        this.currency = currency;
    }

    public Deposit() {
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
