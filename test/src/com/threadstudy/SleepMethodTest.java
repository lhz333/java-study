package com.threadstudy;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class SleepMethodTest extends JFrame {
	private Thread t;
	private static Color[] color = {Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.ORANGE,Color.YELLOW,Color.RED,Color.PINK,Color.LIGHT_GRAY};
//	创建随机对象
	private static final Random rand = new Random();
//	获取随机颜色值的方法
	private static Color getC(){
		return color[rand.nextInt(color.length)];
	}
	public SleepMethodTest(){
//		创建匿名线程对象
		t = new Thread(new Runnable(){
//			定义初始坐标
			int x = 30;
			int y = 50;
//			覆盖线程接口方法
			@Override
			public void run() {
//				无限循环
				while(true){
					try{
//						线程休眠0.1秒
						Thread.sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
//					获取组件绘图上下文对象
					Graphics graphics = getGraphics();
//					设置绘图颜色
					graphics.setColor(getC());
//					绘制直线并递增垂直坐标
					graphics.drawLine(x, y, 100, y++);
					if(y>=80){
						y=50;
					}
				}
				
			}
		});
//		启动线程
		t.start();
	}
	
	public static void main(String[] args) {
		init(new SleepMethodTest(),400,400);
	}
//	初始化程序界面的方法
	private static void init(JFrame frame,int width,int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
}
