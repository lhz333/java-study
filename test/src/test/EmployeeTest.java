package test;

import java.io.*;

public class EmployeeTest {
	public static void main(String[] args) {
		//使用构造函数创建对象
		Employee empOne = new Employee("one");
		Employee empTwo = new Employee("two");
		
		empOne.setAge(26);
		empOne.setDesignation("中级前端工程师");
		empOne.setSalary(1000);
		empOne.printEmployee();
		
		empTwo.setAge(34);
		empTwo.setDesignation("高级后端开发人员");
		empTwo.setSalary(2000);
		empTwo.printEmployee();
	}
}
