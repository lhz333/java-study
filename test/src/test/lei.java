package test;

public class lei {
//	定义成员变量
	int i = 47;
//	定义成员方法
	public void call(){
		System.out.println("调用call()方法");
		for(i = 0;i < 3;i++){
			System.out.println(i+" ");
			if(i == 2){
				System.out.println("\n");
			}
		}
	}
//	定义构造方法
	public lei(){
		
	}
	
	public static void main(String[] args) {
//		创建一个对象
		lei t1 = new lei();
//		创建另一个对象
		lei t2 = new lei();
//		将类成员变量赋值为60
		t2.i = 60;
		System.out.println("第一个实例对象调用变量i的结果："+t1.i++);
		t1.call();
		System.out.println("第二个实例对象调用变量i的结果："+t2.i);
		t2.call();
	}
}
