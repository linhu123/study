package com.linfix.java8.chapter05;

import com.linfix.java8.chapter04.Dish;

import java.util.Arrays;
import java.util.List;

/**
 * @program: study
 * @description: 5.1的测试 利用流选出前两道荤菜
 * @author: linfix
 * @create: 2019-08-28 11:27
 **/
public class Test51 {

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
        menu.stream().filter(dish -> dish.getType().equals(Dish.Type.MEAT)).limit(2).forEach(System.out::println);
    }
}

