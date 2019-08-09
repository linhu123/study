package com.linfix.study.source;

import java.util.ArrayList;

/**
 * 	学习java ArrayList的源码
 *  @author linhu
 *
 */
public class ArrayListSource {
		
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>(20);
		
		System.out.printf("Before add:arrayList.size() = %d\n",arrayList.size());
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
//		arrayList.trimToSize();
		System.out.printf("After add:arrayLisit.size() = %d\n",arrayList.size());
		Integer i = null;
		System.out.println("the first occurrence of the list is "+arrayList.indexOf(i));
	
	
	}
	
	
}
