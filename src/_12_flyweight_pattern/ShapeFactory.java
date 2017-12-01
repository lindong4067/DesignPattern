package _12_flyweight_pattern;

import java.util.HashMap;

/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月23日	
* @time 	: 上午11:29:14
* @version 	: V-0.0.1
* @description	: 
*/
public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap = new HashMap<>();
	public static Shape getCircle(String color) {
		Shape circle = circleMap.get(color);
		if(circle == null){
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("创建一个圆形，颜色是：" + color);
		}
		return circle;
	}
}
