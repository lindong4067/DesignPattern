package _07_onemore;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月22日	
* @time 	: 下午2:03:14
* @version 	: V-0.0.1
* @description	: 形状
*/
public abstract class Shape {
	
	protected Color color;

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract void draw();
}
