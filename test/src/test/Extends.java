package test;

public class Extends {
	public String toString(){
		return "在"+getClass().getName()+"类中重写toString()方法";
	}
	public static void main(String[] args) {
		System.out.println(new Extends());
	}
}
