package com.linfix.java8.chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @program: study
 * @description: 筛选苹果
 * @author: linfix
 * @create: 2019-08-23 14:47
 **/
public class FilterApple {
    public static List<Apple> filterGreenApple(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApple(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if(apple.getWeight() > 150){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> predicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if(predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
    public static boolean isGreenApple(Apple apple){
        return "green".equals(apple.getColor());
    }
    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight() > 150;
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
                new Apple(155, "green"),
                new Apple(120, "red"));
        List<Apple> apples = filterApple(inventory,FilterApple::isGreenApple);
        System.out.println(apples);
        List<Apple> apples1 = filterApple(inventory,(Apple apple)->"green".equals(apple.getColor()));
        System.out.println(apples1);
        List<Apple> apples2 = filterApple(inventory,(Apple apple)->"green".equals(apple.getColor())&&apple.getWeight()>150);
        System.out.println(apples2);

    }
}
