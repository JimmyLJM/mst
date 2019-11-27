package com.prc.java8Learn;

import com.prc.java8Learn.dto.Apple;

import java.io.File;
import java.io.FileFilter;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class learn0 {

    public static void main(String[] args) {

        /**
         * java8 前判断文件列表中那些文件时隐藏
         *
         */
        File[] files =new File(".").listFiles(
                new FileFilter() {
                    @Override
                    public boolean accept(File file) {
                        return file.isHidden();
                    }
                }

        );

        /**
         * java8
         * 直接将file的isHedden方法引用传递给listFiles方法
         */
        File[] files1 =new File(".").listFiles(File :: isHidden);


        /**
         * lambda写法，匿名函数思路，
         *    不需要为只用一次的方法写定义；代码更干净、更清晰，
         */
        File[] files2 =new File(".").listFiles((File f) -> f.isHidden() == true);


        /**
         * 建立返回值map
         *     遍历list
         *          筛选
         *          ...
         *  一眼看出来这些代码是做什么的，因为有好几个嵌套的控制流指令
         */
        Map<String,List<Apple>> apls = new HashMap<String,List<Apple>>();
        List<Apple> apples = new ArrayList<Apple>();
        for (Apple apple : apples) {
            if(apple.getPrice() > 1000){
                String  color = apple.getColor();

                List<Apple> apptemp =   apls.get(color);

                if (apptemp == null) {
                    apptemp = new ArrayList<Apple>();
                    apls.put(color,apptemp);
                }
                apptemp.add(apple);
            }
        }

        /**
         * stream API 方式处理
         *  先按照金额筛选
         *  再按照颜色分组
         *
         *  Collection主要是为了存储和访问数据，而Stream则主要用 于描述对数据的计算
         */
        Map<String,List<Apple>> apls1 = apples.stream().filter((Apple a) -> a.getPrice() > 1000)
                                                .collect(groupingBy(Apple :: getColor));

        /**
         *
         */
        List<Apple> heavyApples =  apples.stream().filter((Apple a) -> a.getWeight() > 150)
                                                 .collect(toList());

        /**
         * lambda表达式简洁处理例子
         */
        Comparator<Apple> byWeight = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());

//        long howManyDishes = menu.stream().collect(Collectors.counting());
    }
}
