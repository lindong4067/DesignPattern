package _10_decorator_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月23日	
* @time 	: 上午10:45:30
* @version 	: V-0.0.1
* @description	: 
*/
public class DecoratorPattern {

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(circle);
		Shape rectangle = new Rectangle();
		Shape redRectangle = new RedShapeDecorator(rectangle);
		System.out.println("=== 画一个圆形 ===");
		circle.draw();
		System.out.println("=== 画一个红边圆形 ===");
		redCircle.draw();
		System.out.println("=== 画一个矩形 ===");
		rectangle.draw();
		System.out.println("=== 画一个红边矩形 ===");
		redRectangle.draw();
	}

}
