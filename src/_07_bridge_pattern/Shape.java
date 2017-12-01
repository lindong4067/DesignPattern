package _07_bridge_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月22日	
* @time 	: 上午10:24:35
* @version 	: V-0.0.1
* @description	: 形状抽象类
*/
public abstract class Shape {
	
	protected Draw draw;
	
	protected Shape(Draw draw) {
		this.draw = draw;
	}
	
	public abstract void draw();
}
