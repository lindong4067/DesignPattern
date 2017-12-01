package _05_prototype_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月21日	
* @time 	: 下午1:43:20
* @version 	: V-0.0.1
* @description	: 矩形
*/
public class Rectangle extends Shape {
	
	public Rectangle() {
		type = "Rectangle";
	}
	@Override
	public void draw() {
		System.out.println("执行Rectangle.draw()方法，画一个矩形！");
	}

}
