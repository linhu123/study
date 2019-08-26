package com.linfix.java8.chapter03;

/**
 * @program: study
 * @description: 几个简单的Lambda
 * @author: linfix
 * @create: 2019-08-23 18:29
 **/
public class LambdaSimple {
    public static void main(String[] args) {
        //(String s)->s.length();
        /**
         * 第一个Lambda表达式具有一个String类型的参
         数并返回一个int。 Lambda没有return语句，因为已经隐含了return
         */
        //======================================
        //(Apple a) -> a.getWeight() > 150
        /**
         * 第二个Lambda
         表达式有一个Apple 类 型 的参数并返回一个boolean（苹果的重量是否超过150克）
         */
        //(int x, int y) -> {
        //System.out.println("Result:");
        //System.out.println(x+y); }
        //=======================================
        /**
         * 第三个Lambda表达式具有两个int类型的参
         数而没有返回值（ void返回）。注意Lambda表达式可以包含多行语句，这里是两行
         */
        //() -> 42
        //(Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight())
    }
}
