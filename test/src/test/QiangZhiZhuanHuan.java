package test;

public class QiangZhiZhuanHuan {
	static final double PI = 3.14;
	static int age = 23;
	public static void main(String[] args) {
		final int number;
		number = 1234;
		age = 22;
//		PI = 4.23;
		int i1 = 123;
		byte b = (byte)i1;
		System.out.println("int强制类型转换为byte后的值等于："+b);
//		可使用汉字作为变量
		int 年龄 = 22;
		System.out.println("年龄："+年龄);
	}
}
