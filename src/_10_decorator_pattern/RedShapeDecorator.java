package _10_decorator_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月23日	
* @time 	: 上午10:40:54
* @version 	: V-0.0.1
* @description	: 
*/
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		super.draw();
		this.setRedBorder();
	}
	
	private void setRedBorder() {
		System.out.println("边框：红色");
	}
}
