package _05_prototype_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月21日	
* @time 	: 下午1:46:44
* @version 	: V-0.0.1
* @description	: 正方形
*/
public class Square extends Shape {
	
	public Square() {
		type = "Square";
	}
	@Override
	public void draw() {
		System.out.println("执行Square.draw()方法，画一个正方形！");
	}

}
