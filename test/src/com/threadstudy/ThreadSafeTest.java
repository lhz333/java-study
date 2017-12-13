package com.threadstudy;

public class ThreadSafeTest implements Runnable {
	//设置当前总票数
	int num = 10;
	public void run(){
		while(true){
//			同步机制
			synchronized ("") {
				if(num>0){
					try{
						Thread.sleep(100);
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println("tickets"+--num);
				}
			}
		}
	}
	public static void main(String[] args) {
//		实例化类对象
		ThreadSafeTest t = new ThreadSafeTest();
//		以该类对象分别实例化4个线程
		Thread tA = new Thread(t);
		Thread tB = new Thread(t);
		Thread tC = new Thread(t);
		Thread tD = new Thread(t);
//		分别启动线程
		tA.start();
		tB.start();
		tC.start();
		tD.start();
	}
	
}
