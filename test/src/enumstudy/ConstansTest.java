package enumstudy;

//将常量放置在接口中
interface Constants{
	public static final int Constants_A = 1;
	public static final int Constants_B = 12;
}

public class ConstansTest {
	//将常量放在枚举类型中
	enum Constants2{
		Constants_A,Constants_B
	}
	//使用接口定义常量
	/**
	 * 根据常量的值做不同的操作
	 * @param c int型
	 */
	public static void doit(int c){
		switch(c){
		case Constants.Constants_A:
			System.out.println("doit() Constants_A");
			break;
		case Constants.Constants_B:
			System.out.println("doit() Constants_B");
			break;
		}
	}
	/**
	 * 定义一个参数对象是枚举类型的方法
	 * @param c  枚举类型
	 */
	public static void doit2(Constants2 c){
		switch(c){
		case Constants_A:
			System.out.println("doit2() Constants_A");
			break;
		case Constants_B:
			System.out.println("doit2() Constants_B");
			break;
		}
	}
	//主方法
	public static void main(String[] args) {
		ConstansTest.doit(Constants.Constants_A);
		ConstansTest.doit2(Constants2.Constants_A);
		ConstansTest.doit2(Constants2.Constants_B);
		ConstansTest.doit(3);
//		ConstansTest.doit2(3);
	}
}
