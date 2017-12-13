package com.threadstudy;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JoinTest extends JFrame {
//	定义两个线程
	private Thread threadA;
	private Thread threadB;
//	定义两个进度条组件
	final JProgressBar progressBar = new JProgressBar();
	final JProgressBar progressBar2 = new JProgressBar();
	int count = 0;
	public static void main(String[] args) {
		init(new JoinTest(),400,400);
	}
//	设置窗体的各种属性的方法
	private static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
	public JoinTest(){
		super();
//		将进度条设置在窗体最北面
		getContentPane().add(progressBar, BorderLayout.NORTH);
//		将进度条设置在窗体最南面
		getContentPane().add(progressBar2, BorderLayout.SOUTH);
//		设置进度条显示数字字符
		progressBar.setStringPainted(true);
		progressBar2.setStringPainted(true);
//		使用匿名内部类形式初始化Tread实例
		threadA = new Thread(new Runnable(){
			int count = 0;
//			重写run()方法
			@Override
			public void run() {
				while(true){
//					设置当前的进度条值
					progressBar.setValue(++count);
					try{
//						使线程A休眠100毫秒
						Thread.sleep(100);
//						使线程B调用join()方法
						threadB.join();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
				
			}
		});
//		启动线程A
		threadA.start();
		
		threadB = new Thread(new Runnable(){
			int count = 0;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
//					设置进度条的当前值
					progressBar2.setValue(++count);
					try{
//						使线程B休眠100毫秒
						Thread.sleep(100);
					}catch(Exception e){
						e.printStackTrace();
					}
//					当count变量增长为100时
					if(count == 100){
//						跳出循环
						break;
					}
				}
			}
			
		});
//		启动线程B
		threadB.start();
	}
	
}
