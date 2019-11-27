package com.prc.desiners.中介者模式.demo;

public class Test {

    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        md.register(c1);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
