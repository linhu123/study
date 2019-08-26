package com.linfix.java8.chapter02.test2_1;

import com.linfix.java8.chapter01.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: study
 * @description: 参数化打印Apple
 * @author: linfix
 * @create: 2019-08-23 17:36
 **/
public class PrintApple {

    public static void prettyPrintApple(List<Apple> inventory,Pretty pretty){
        for(Apple apple: inventory) {
            String output = pretty.formateApple(apple);
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        String[] colors = {"yellow","red","black","green","blue"};
        List<Apple> inventory = new ArrayList<>();
        for (int i = 1;i<100;i++){
            inventory.add(new Apple(i,colors[i%5]));
        }
        prettyPrintApple(inventory,new PrintAppleColor());
    }
}
