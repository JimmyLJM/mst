package com.prc.java8Learn.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Apple {

    private Integer price;

    private String color;

    private Integer weight;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public Apple() {
    }

    public Apple(Integer price, String color, Integer weight) {
        this.price = price;
        this.color = color;
        this.weight = weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }


}
