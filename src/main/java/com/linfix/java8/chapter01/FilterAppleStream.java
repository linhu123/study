package com.linfix.java8.chapter01;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @program: study
 * @description: 用stream来筛选苹果
 * @author: linfix
 * @create: 2019-08-23 16:37
 **/
public class FilterAppleStream {

    public static void main(String[] args) {
        String[] colors = {"yellow","red","black","green","blue"};
        List<Apple> inventory = new ArrayList<>();
        for (int i = 1;i<100000000;i++){
            inventory.add(new Apple(i,colors[i%5]));
        }
        long start = System.currentTimeMillis();
        List<Apple> list = inventory.stream().filter((Apple apple)->apple.getWeight()>150).collect(toList());
        long end = System.currentTimeMillis();
//        System.out.println(list);
        System.out.println("use time is "+(end-start));
//==========================================================================
        long start1 = System.currentTimeMillis();
        List<Apple> list1 = inventory.parallelStream().filter((Apple apple)->apple.getWeight()>150).collect(toList());
        long end1 = System.currentTimeMillis();
//        System.out.println(list1);
        System.out.println("use time is "+(end1-start1));
//==========================================================================
        long start2 = System.currentTimeMillis();
        List<Apple> apples = FilterApple.filterApple(inventory,(Apple apple)->apple.getWeight()>150);
        long end2 = System.currentTimeMillis();
//        System.out.println(apples);
        System.out.println("use time is "+(end2-start2));
    }
}
