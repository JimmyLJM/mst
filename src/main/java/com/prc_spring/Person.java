package com.prc_spring;

/**
 * 拥有吃食物的方法
 */
public class Person {

    private String name;

    private Food f;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name + "吃了" + f.toString());
    }

    public Food getF() {
        return f;
    }

    public void setF(Food f) {
        this.f = f;
    }
}
