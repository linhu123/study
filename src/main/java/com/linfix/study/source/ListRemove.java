package com.linfix.study.source;

import java.util.ArrayList;

public class ListRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("c++");
        list.add("java");
        list.add("java");
        list.add("python");
        remove1(list);
    }
    public static void remove1(ArrayList<String> list){
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            if(s.equals("java")){
                list.remove(s);
            }
        }
        for (String s:list){
            System.out.println(s);
        }
    }
    public void remove11(ArrayList<String> list) {
        for(int i=list.size()-1; i>=0; i--) {
            String s = list.get(i);
            if (s.equals("java")) {
                list.remove(s);
            }
        }
    }

}
