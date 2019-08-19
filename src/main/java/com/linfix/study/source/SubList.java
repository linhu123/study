package com.linfix.study.source;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c++");
        list.add("java");

        List<String> list1 = new ArrayList<>(list);

    }

}
