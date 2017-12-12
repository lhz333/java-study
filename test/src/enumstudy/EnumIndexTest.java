package enumstudy;

import static java.lang.System.out;

public class EnumIndexTest {
	enum Constants{
		Constants_A("我是枚举成员A"),
		Constants_B("我是枚举成员B"),
		Constants_C("我是枚举成员C"),
		Constants_D(3);
		private String description;
		private int i = 4;
		private Constants(){
			
		}
		/**
		 * 定义参数为String类型的构造方法
		 * @param description  String类型
		 */
		private Constants(String description){
			this.description = description;
		}
		/**
		 * 定义参数为int型的构造方法
		 * @param i  int类型
		 */
		private Constants(int i){
			this.i = this.i+i;
		}
		/**
		 * 获取description的值
		 * @return
		 */
		public String getDescription(){
			return description;
		}
		/**
		 * 获取i的值
		 * @return
		 */
		public int get(){
			return i;
		}
	}
	//主方法
	public static void main(String[] args) {
		for(int i=0;i<Constants.values().length;i++){
			System.out.println(Constants.values()[i]+"调用getDescription()方法为："+Constants.values()[i].getDescription());
		}
		out.println(Constants.valueOf("Constants_D")+"调用get()方法为："+Constants.valueOf("Constants_D").get());
	}
}
