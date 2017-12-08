package com.collection;

import java.util.*;

public class MapText {
	public static void main(String[] args) {
//		由HashMap实现的Map对象
		Map<String,String> map = new HashMap<>();
//		创建emp对象
		Emp emp1 = new Emp("351","张三");
		Emp emp2 = new Emp("125","李四");
		Emp emp3 = new Emp("853","王五");
//		将对象添加到集合中
		map.put(emp1.getE_id(), emp1.getE_name());
		map.put(emp2.getE_id(), emp2.getE_name());
		map.put(emp3.getE_id(), emp3.getE_name());
//		获取Map集合中的key对象集合
		Set <String> set = map.keySet();
		Iterator<String> it = set.iterator();
		System.out.println("HashMap类实现的Map集合，无序：");
		while(it.hasNext()){
			String str = (String)it.next();
//			遍历map集合
			String name = (String) map.get(str);
			System.out.println(str+" "+name);
		}
		
		
//		创建TreeMap集合对象
		TreeMap<String,String> treemap = new TreeMap<>();
		treemap.putAll(map);
		Iterator<String> iter = treemap.keySet().iterator();
		System.out.println("TreeMap类实现的Map集合，键对象升序：");
		while(iter.hasNext()){
			String str = (String)iter.next();
			String name = (String)treemap.get(str);
			System.out.println(str+" "+name);
		}
	}
}
