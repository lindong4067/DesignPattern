package _05_prototype_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月21日	
* @time 	: 下午2:15:20
* @version 	: V-0.0.1
* @description	: 原型模式
*/
public class PrototypePattern {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape shape1 = ShapeCache.getShape("1");
		System.out.println("Shape1 : " + shape1.getType());
		
		Shape shape2 = ShapeCache.getShape("2");
		System.out.println("Shape2 : " + shape2.getType());
	}

}
