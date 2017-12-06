package com.lzw;

import static java.lang.System.out;
import java.util.Random;

public class FinalData {
	private static Random rand = new Random();
	private final int a1 = rand.nextInt(10);
	private static final int a2 = rand.nextInt(10);
	public static void main(String[] args) {
		FinalData fdata = new FinalData();
		out.println("重新实例化对象调用a1的值："+fdata.a1);
		out.print("重新实例化对象调用a2的值："+fdata.a2+"\n");
		FinalData fdata2 = new FinalData();
		out.println("重新实例化对象调用a1的值："+fdata2.a1);
		out.print("重新实例化对象调用a2的值："+fdata2.a2);
	}
}
