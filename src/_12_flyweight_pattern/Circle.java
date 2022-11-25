package _12_flyweight_pattern;

/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月23日	
* @time 	: 上午11:15:47
* @version 	: V-0.0.1
* @description	: 
*/
public class Circle implements Shape {
	private String color;
	private int x;
	private int y;
	private int radius;
	
	public Circle(String color) {
		super();
		this.color = color;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println("圆形 : [颜色 : " + color +", x : " + x +", y :" + y +", 半径 :" + radius);
	}

}
