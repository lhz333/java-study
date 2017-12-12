package com.fanshe;

import java.lang.reflect.Constructor;

public class Two {
	public static void main(String[] args) {
		One example = new One("10","20","30");
		Class<? extends One> exampleC = example.getClass();
		//获得所有构造方法
		Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();
		//遍历构造方法
		for(int i=0;i<declaredConstructors.length;i++){
			Constructor<?> constructor = declaredConstructors[i];
			System.out.println("查看是否允许带有可变数量的参数："+constructor.isVarArgs());
			System.out.println("该构造方法的入口参数类型依次为：");
			Class[] parameterTypes = constructor.getParameterTypes();
			for(int j=0;j<parameterTypes.length;j++){
				System.out.println(""+parameterTypes[j]);
			}
			System.out.println("该构造方法可能抛出的异常类型为：");
			//获得所有可能抛出的异常信息类型
			Class[] exceptionTypes = constructor.getExceptionTypes();
			for(int j=0;j<exceptionTypes.length;j++){
				System.out.println(""+exceptionTypes[j]);
			}
		}
	}
}
