package test;

public class ZiDongLeiZhuan {
	public static void main(String[] args) {
		//定义一个char类型
		char c1 = 'a';
		//char自动类型转换为int
		int i1 = c1;
		System.out.println("char自动类型转换为int后的值等于："+i1);
		char c2 = 'A';
		int i2 = c2+1;
		System.out.println("char类型和int计算后的值等于："+i2);
		//c1的值为字符'a',查ASCII码表可知对应的int类型值为97,'A'对应值为65，所以i2= 65+1=66;
	}
}
