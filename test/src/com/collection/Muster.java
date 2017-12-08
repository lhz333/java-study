package com.collection;

import java.util.*;

public class Muster {
	public static void main(String[] args) {
//		实例化集合类对象
		Collection<String> list = new ArrayList<>();
//		向集合中添加数据
		list.add("a");
		list.add("b");
		list.add("c");
//		创建迭代器
		Iterator<String> it = list.iterator();
//		判断是否有下一个元素
		while(it.hasNext()){
//			获取集合中的元素
			String str = (String) it.next();
			System.out.println(str);
		}
	}
}
