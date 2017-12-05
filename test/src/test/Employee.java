package test;

import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	//构造函数
	public Employee(String name){
		this.name = name;
	}
	//设置name的值
	public void setAge(int empAge){
		age = empAge;
	}
	//设置职位
	public void setDesignation(String empDesig){
		designation = empDesig;
	}
	//设置薪水
	public void setSalary(double empSalary){
		salary = empSalary;
	}
	//打印信息
	public void printEmployee(){
		System.out.println("名字："+name);
		System.out.println("年龄："+age);
		System.out.println("职位："+designation);
		System.out.println("薪水："+salary);
	}
}
