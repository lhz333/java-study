package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZip {
	private void zip(String zipFileName,File inputFile) throws Exception{
//		创建ZipOutputStream类对象
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
//		调用方法
		zip(out,inputFile,"");
//		输出信息
		System.out.println("压缩中。。。");
//		将流关闭
		out.close();
	}
    
	/**
	 * 方法重载
	 * @param out
	 * @param f
	 * @param base
	 */
	private void zip(ZipOutputStream out, File f, String base) throws Exception {
		// TODO Auto-generated method stub
		//测试此抽象路径名表示的文件是否为一个目录
		if(f.isDirectory()){
			//获取路径数组
			File[] fl = f.listFiles();
			//循环遍历数组中的文件
			if(base.length()!=0){
				out.putNextEntry(new ZipEntry(base+"/"));
				for(int i = 0;i<fl.length;i++){
					zip(out,fl[i],base+fl[i]);
				}
			}else{
//				创建新的进入点
				out.putNextEntry(new ZipEntry(base));
//				创建FileInputStream类对象
				FileInputStream in = new FileInputStream(f);
//				定义int型变量
				int b;
				System.out.println(base);
//				如果没有到达流的尾部
				while((b=in.read())!=-1){
//					将字节写入当前ZIP条目
					out.write(b);
				}
//				关闭流
				in.close();
			}
		}
	}
	
	public static void main(String[] args) {
//		创建本例对象
		MyZip book = new MyZip();
		try{
//			调用方法，参数为压缩后的文件与要压缩的文件
			book.zip("D:/hello.zip", new File("D:/hello"));
			System.out.println("压缩完成");
		}catch(Exception ex){
			
		}
	}
}
