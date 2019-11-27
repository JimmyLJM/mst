package com.prc.java8Learn;

import com.prc.java8Learn.dto.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Test {
    public static void main(String[] args) {

        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0);
        System.out.println(evenNumbers.count());


        Stream<int[]> pythagoreanTriples =  IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
                        .mapToObj(b -> new int[]{a, b, (int)Math.sqrt(a * a + b * b)}));

        //pythagoreanTriples.forEach(s -> System.out.println(s));

        pythagoreanTriples.map(a -> a[0] + ","+a[1] + ","+a[2]).forEach(s -> System.out.println(s));


    }
}
