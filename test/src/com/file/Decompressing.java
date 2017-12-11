package com.file;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Decompressing {
	public static void main(String[] temp) {
//		当前压缩文件
		File file = new File("hello.zip");
//		创建ZipInputStream对象
		ZipInputStream zin;
		try{
//			创建压缩文件对象
			ZipFile zipFile = new ZipFile(file);
//			实例化对象，指明要进行解压的文件
			zin = new ZipInputStream(new FileInputStream(file));
//			跳过根目录，获取下一个ZipEntry
			ZipEntry entry = zin.getNextEntry();
			while(((entry=zin.getNextEntry())!=null)&&!entry.isDirectory()){
				File tmp = new File("D:\\"+entry.getName());
				if(!tmp.exists()){
					tmp.getParentFile().mkdirs();
					OutputStream os = new FileOutputStream(tmp);
					InputStream in = zipFile.getInputStream(entry);
					int count = 0;
					while((count=in.read())!=-1){
						os.write(count);
					}
					os.close();
					in.close();
				}
				zin.closeEntry();
				System.out.println(entry.getName()+"解压成功");
			}
			zin.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
