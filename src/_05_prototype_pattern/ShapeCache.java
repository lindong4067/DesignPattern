package _05_prototype_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月21日	
* @time 	: 下午1:50:51
* @version 	: V-0.0.1
* @description	: 查询数据库获取实体的类保存进map
*/

import java.util.Hashtable;

public class ShapeCache {
	
	public static Hashtable<String, Shape> shapeMap = new Hashtable<>();
	
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	//模拟一个查询数据库并保存Map的过程
	public static void loadCache() {
		Square square = new Square();
		square.setId("1");
		shapeMap.put(square.getId(),square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(),rectangle);
	}
}
