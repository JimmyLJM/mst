package com.prc.java8Learn;

import com.alibaba.fastjson.JSONObject;
import com.prc.java8Learn.dto.Apple;
import com.prc.java8Learn.dto.Dish;
import com.prc.java8Learn.util.DtoUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class learn1 {

    public static void main(String[] args) {


        List<Apple> lowCaloricDishes = DtoUtil.initApplList();
        List<Apple> lowCaloricDishes1 = new ArrayList<>();
        for (Apple d : lowCaloricDishes1) {
            if (d.getPrice() < 400) {
                lowCaloricDishes.add(d);
            }
        }


        /**
         *  选出价格超400
         *  按照重量排序
         * 获取颜色
         * 组成list
         *
         */
        List<String> colorList = lowCaloricDishes.stream()
                .filter(d -> d.getPrice() < 400)
                .sorted(comparing(Apple :: getWeight))
                .map(Apple::getColor)
                .collect(toList());

        /**
         * 为了利用多核架构并行执行这段代码，你只需要把stream()换成parallelStream()：
         *
         * 1、苹果集合的流
         * 2、操作
         *      2.1 筛选价格小于400
         *      2.2 获取颜色
         *      2.3将结果保存到另一个list
         *
         *  filter——接受Lambda，从流中排除某些元素。
         *  map——接受一个Lambda，将元素转换成其他形式或提取信息。
         *  limit——截断流，使其元素不超过给定数量。
         *  collect——将流转换为其他形式。
         */
        List<String> colorList2 = lowCaloricDishes.parallelStream()
                .filter(d -> d.getPrice() < 400)
                .sorted(comparing(Apple :: getWeight))
                .map(Apple::getColor)
                .collect(toList());

        System.out.println(JSONObject.toJSONString(colorList));
        System.out.println(JSONObject.toJSONString(colorList2));



        List<Dish> dishes = Dish.menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .limit(3)
                .collect(toList());

        //
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        List<Integer> wordLengths = words.stream()
                                            .map(String::length)
                                            .collect(toList());

        /**
         * 给定列表[1, 2, 3]和列表[3, 4]
         * 返回[(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]
         *
         *
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<Integer> numbers1 = Arrays.asList(3, 4);
        List<Integer[]> transferArry = numbers.stream()
                                              .flatMap( i ->  numbers1.stream()
                                                                      .map(j -> new Integer[]{i,j})
                                                        )
                                              .collect(toList());



    }
}
