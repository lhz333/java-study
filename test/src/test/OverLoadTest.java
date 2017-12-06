package test;
/**
 * 方法的重载
 * @author li
 *
 */
public class OverLoadTest {
	/**
	 * 定义一个整数相加的方法
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public static int add(int a,int b){
		System.out.println("int add(int a,int b)");
		return a + b;
	}
//	定义与第一个方法相同名称，参数类型不同的方法
	public static double add(double a,double b){
		System.out.println("double add(double a,double b)");
		return a + b;
	}
//	定义与第一个参数个数不同的方法
	public static int add(int a){
		System.out.println("int add(int a)");
		return a;
	}
//	定义一个成员方法
	public static int add(int a,double b){
		System.out.println("int add(int a,double b)");
		return 1;
	}
//	不定长参数方法
	public static int add (int...a){
		System.out.println("int add(int...a)");
		int s = 0;
		for(int i=0;i<a.length;i++){
			s=s+a[i];
		}
		return s;
	}
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(add(1,2));
		System.out.println(add(3.4,1.2));
		System.out.println(add(6));
		System.out.println(add(6,1.2));
		System.out.println(add(1,2,3,4));
		System.out.println(add(2));
	}
	
}
