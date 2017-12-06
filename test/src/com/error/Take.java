package com.error;

public class Take {
	public static void main(String[] args) {
		try{
			String name = "lili";
			System.out.println(name+"的年龄是：");
			int age = Integer.parseInt("20L");
			System.out.println(age);
		}
//		catch语句用来获取异常信息
		catch(Exception e){
//			输出异常性质
			e.printStackTrace();
		}
//		输出信息
		System.out.println("program over");
	}
}
