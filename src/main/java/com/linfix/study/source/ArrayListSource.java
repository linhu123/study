package com.linfix.study.source;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.SchemaOutputResolver;

/**
 * 	学习java ArrayList的源码
 *  @author linhu
 *
 */
public class ArrayListSource {
		
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Integer[] array1 = new Integer[3];
		list.toArray(array1);
		for(int i : array1)System.out.println(i);
		Integer[] array2 = list.toArray(new Integer[0]);
		for(int i : array2)System.out.println(i);
		System.out.println(Arrays.equals(array1, array2));
		//1 结果是什么？为什么？
		
		Integer[] array = {1,2,3};
		List<Integer> list1 = Arrays.asList(array);
		list1.add(4);
		//2 结果是什么？为什么？
		
		Integer[] array3 = {1,2,3};
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(array3));
		list2.add(4);//3 结果是什么？为什么？
		
		
	
	}
	
	
}
