package com.linfix.java8.chapter02.test2_1;

import com.linfix.java8.chapter01.Apple;

/**
 * @program: study
 * @description: 打印苹果颜色的行为
 * @author: linfix
 * @create: 2019-08-23 17:40
 **/
public class PrintAppleColor implements Pretty {

    @Override
    public String formateApple(Apple apple) {
        return "apple's color is "+apple.getColor();
    }
}
