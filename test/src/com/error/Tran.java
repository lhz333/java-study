package com.error;

public class Tran {
	/**
	 * 自定义异常
	 * @param number1 
	 * @param number2
	 * @return 数值的平均值
	 * @throws Exception
	 */
	static int avg(int number1,int number2) throws Exception{
		if(number1<0||number2<0){
//			如果数值小于0，则抛出错误信息
			throw new Exception("不可以使用负数");
		}
		if(number1>100||number2>100){
//			如果数值大于100，则抛出错误信息
			throw new Exception("数值太大了");
		}
//		返回平均值
		return (number1+number2)/2;
	}
	
	
//	主方法
	public static void main(String[] args) {
		try{
			int result = avg(45,102);
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
