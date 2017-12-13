package com.threadstudy;

//指定类继承Thread类
public class ThreadTest extends Thread {
	private int count = 10;
//	重写run方法
	public void run(){
		while(true){
			System.out.println(count+"");
//			使count变量自减，当自减为0时，退出循环
			if(--count==0){
				return;
			}
		}
	}
	public static void main(String[] args) {
		new ThreadTest().start();
	}
}
