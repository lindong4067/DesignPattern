package _10_decorator_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月23日	
* @time 	: 上午10:37:37
* @version 	: V-0.0.1
* @description	: 
*/
public abstract class ShapeDecorator implements Shape {
	
	protected Shape shape;
	
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}
	
	@Override
	public void draw() {
		shape.draw();
	}

}
