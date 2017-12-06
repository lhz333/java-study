package test;
/**
 * 使用instanceof操作符判断对象类型
 * @author li
 *
 */
class Quadrangle1{
	public static void draw(Quadrangle1 q){
		
	}
}
class Square1 extends Quadrangle1{
	
}
class Anything{
	
}
public class ten extends Quadrangle1{
	public static void main(String[] args) {
		Quadrangle1 q = new Quadrangle1();
		System.out.println(q instanceof ten);
		if(q instanceof ten){
			ten p = (ten) q;
		}
	}
}
