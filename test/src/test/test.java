package test;
//导入java.util.Date类包
import java.util.Date;

public class test {
	public test(){
		System.out.println("创建对象");
	}
    public static void main(String[] args) {
    	new test();
		String str = new String(" We are students  ");
		int size = str.length();
		System.out.println(size);
		System.out.println(str.substring(0, 4));
		System.out.println(str.trim().length());
		System.out.println(str.replace("We", "You"));
		Date date = new Date();
		String s = String.format("%tc", date);
		System.out.println(s);
		System.out.println("年-月-日格式："+String.format("%tF",date));
		@SuppressWarnings("unused")
		String one = "";
		//验证字符串操作与字符串生成器操作的效率
		long starTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			str = str + i;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
		System.out.println("String消耗的时间："+time);
		//字符串生成器的操作效率
		StringBuilder builder = new StringBuilder("");
		starTime = System.currentTimeMillis();
		for(int j=0;j<10000;j++){
			builder.append(j);
		}
		endTime = System.currentTimeMillis();
		time = endTime - starTime;
		System.out.println("StringBuilder消耗时间："+time);
		
//		向字符串生成器中指定的位置添加字符
		StringBuilder bf = new StringBuilder("hello");
		bf.insert(5, " world");
		System.out.println(bf);
		
		//删除
		StringBuilder delestr = new StringBuilder("StringBuilder");
		delestr.delete(5, 10);
		System.out.println(delestr);
	}
}
