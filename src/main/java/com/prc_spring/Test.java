package com.prc_spring;

public class Test {

    public static void main(String[] args) {

        Apple f = new Apple();
        f.setTaste("甜的");
        f.setColor("红色");

        Person p = new Person();
        p.setName("Jimmy");
        p.setF(f);

        p.eat();
    }
}
