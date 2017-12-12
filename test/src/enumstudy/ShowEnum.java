package enumstudy;

public class ShowEnum {
	//将常量放置在枚举类型中
	enum Constants2{
		Constants_A,Constants_B
	}
	/**
	 * 定义比较枚举类型方法
	 * @param c 枚举类型
	 */
	public static void compare(Constants2 c){
		//根据values()方法返回的数组做循环
		for(int i=0;i<Constants2.values().length;i++){
			//将比较结果返回
			System.out.println(c+"与"+Constants2.values()[i]+"的比较结果为："+c.compareTo(Constants2.values()[i]));
		}
	}
	public static void main(String[] args) {
		//循环由values()方法返回的数组
		for(int i=0;i<Constants2.values().length;i++){
			//将枚举成员变量打印
			System.out.println("枚举类型成员变量:"+Constants2.values()[i]+","+Constants2.values()[i]+"在枚举类型中位置索引值为："+Constants2.values()[i].ordinal());
		}
		//调用compare方法
		compare(Constants2.valueOf("Constants_B"));
		compare(Constants2.valueOf("Constants_A"));
	}
}
