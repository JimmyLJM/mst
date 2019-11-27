package com.prc_spring;

public class Apple extends Food{

    /**
     * 颜色
     */
    private String color;

    /**
     * 口味
     */
    private String taste;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
