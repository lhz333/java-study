package com.error;

public class Captor {
	static int quotient(int x,int y) throws Exception{
		if(y<0){
			throw new Exception("除数不能为负数");
		}
		return x/y;
	}
	public static void main(String[] args) {
		try{
			int result = quotient(3,-1);
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}catch(Exception e){
			System.out.println("程序发生了异常");
		}
	}
}
