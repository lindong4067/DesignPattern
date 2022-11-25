package _11_facade_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月23日	
* @time 	: 上午11:03:04
* @version 	: V-0.0.1
* @description	: 创建外观模式的外观类
*/
public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	public ShapeMaker() {
		super();
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawSquare() {
		square.draw();
	}
}
