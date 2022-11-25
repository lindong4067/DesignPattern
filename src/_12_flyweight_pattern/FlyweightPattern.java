package _12_flyweight_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月23日	
* @time 	: 上午11:39:27
* @version 	: V-0.0.1
* @description	: 享元模式(共享元数据)
*/
public class FlyweightPattern {
	
	private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};
	
	private static String getRandomColor() {
		return colors[(int)(Math.random()*colors.length)];
	}
	
	private static int getRandomX() {
		return (int)(Math.random()*100);
	}
	
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}
	
	public static void main(String[] args) {
		for(int i=0; i<20; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

}
