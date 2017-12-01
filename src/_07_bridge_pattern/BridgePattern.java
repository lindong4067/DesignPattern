package _07_bridge_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月22日	
* @time 	: 下午1:04:08
* @version 	: V-0.0.1
* @description	: 桥接模式
*/
public class BridgePattern {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}

}
