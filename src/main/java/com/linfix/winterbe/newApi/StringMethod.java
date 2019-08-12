package com.linfix.winterbe.newApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Ref;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.SchemaOutputResolver;

public class StringMethod {
	public static void testJoin() {
		List<String> strList = new ArrayList<String>();
		String index = String.join(",","one","two","three");
		System.out.println(index);
		strList.add("111");
		strList.add("222");
		strList.add("333");
		String index1 = String.join(":", strList);
		System.out.println(index1);
	}
	public static void testChars() {
		String collect = "foobar:foo:bar"
	    .chars()
	    .distinct()
	    .mapToObj(c -> String.valueOf((char)c))
	    .sorted()
	    .collect(Collectors.joining());
		System.out.println(collect);
	}
	
	public static void rwFile() {
		String path = "D:\\res\\index.txt";
		try {
			List<String> lines = Files.readAllLines(Paths.get("D:\\res\\index.txt"));
			System.out.println(lines);
		} catch (IOException e) {
			System.out.println(String.format("{}文件没有找到",path));
		}
	}
	
	public static void main(String[] args) {
//		testChars();
		rwFile();
	}
}
