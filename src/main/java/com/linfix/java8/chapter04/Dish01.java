package com.linfix.java8.chapter04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @program: study
 * @description: 学习Stream 示例1
 * @author: linfix
 * @create: 2019-08-26 10:30
 **/
public class Dish01 {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );
        List<String> title = Arrays.asList("java","c++","python");
        Stream<String> stream = title.stream();
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);//Stream 流只能被遍历一遍


    }

}
