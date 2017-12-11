package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("word.txt");
		if(file.exists()){
			String name = file.getName();
			long length = file.length();
			boolean hidden = file.isHidden();
			System.out.println("文件名称："+name);
			System.out.println("文件长度是："+length);
			System.out.println("该文件是隐藏文件么？"+hidden);
//			file.delete();
//			System.out.println("文件已删除");
		}else{
			try{
				file.createNewFile();
				System.out.println("文件已创建");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		try{
			FileOutputStream out = new FileOutputStream(file);
			byte buy[] = "胡大姐你是我的妻咯".getBytes();
			//将数组中的信息写入到文件中
			out.write(buy);
			//将流关闭
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileInputStream in = new FileInputStream(file);
			byte byt[] = new byte[1024];
			//从文件中读取信息
			int len = in.read(byt);
			//将文件中的信息输出
			System.out.println("文件中的信息："+new String(byt,0,len));
			//关闭流
			in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
