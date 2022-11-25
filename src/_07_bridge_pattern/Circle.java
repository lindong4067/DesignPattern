package _07_bridge_pattern;

/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月22日	
* @time 	: 下午12:54:58
* @version 	: V-0.0.1
* @description	: 实现Shape接口的实体
*/
public class Circle extends Shape {

	private int x, y, radius;
	
	protected Circle(int x, int y, int radius, Draw draw) {
		super(draw);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void draw() {
		draw.drawCircle(radius, x, y);
	}


}
