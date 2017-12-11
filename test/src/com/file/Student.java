package com.file;

import java.awt.geom.FlatteningPathIterator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Student {
	public static void main(String[] args) {
		String content[] = {"好久不见","最近好吗","常联系"};
//		创建文件
		File file = new File("lixian.txt");
		try{
//			创建FileWriter类对象
			FileWriter fw = new FileWriter(file);
//			创建bufferedWriter类对象
			BufferedWriter bufw = new BufferedWriter(fw);
//			循环遍历数组
			for(int k=0;k<content.length;k++){
//				将字符串数组中的元素写入到磁盘文件中
				bufw.write(content[k]);
//				将数组中的单个元素以单行的形式写入文件
				bufw.newLine();
			}
//			将bufferedWriter流关闭
			bufw.close();
//			将FileWriter流关闭
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
//			创建FileReader类对象
			FileReader fr = new FileReader(file);
//			创建BufferedReader类对象
			BufferedReader bufr = new BufferedReader(fr);
//			创建字符串对象
			String s = null;
//			声明int型变量
			int i = 0;
			while((s=bufr.readLine())!=null){
//				将变量做自增运算
				i++;
				System.out.println("第"+i+"行："+s);
			}
//			将BufferedReader流关闭
			bufr.close();
//			将FileReader流关闭
			fr.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
