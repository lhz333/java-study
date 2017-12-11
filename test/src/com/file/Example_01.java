package com.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example_01 {
	public static void main(String[] args) {
		try{
			FileOutputStream fs = new FileOutputStream("example01.txt");
			DataOutputStream ds = new DataOutputStream(fs);
//			写入磁盘文件数据
			ds.writeUTF("使用writeUTF()方法写入数据;");
			ds.writeChars("使用writeCharts()方法写入数据;");
			ds.writeBytes("使用writeBytes()方法写入数据");
			ds.close();
			FileInputStream fis = new FileInputStream("example01.txt");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readUTF());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
