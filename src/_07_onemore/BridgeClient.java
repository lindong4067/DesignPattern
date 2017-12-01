package _07_onemore;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月22日	
* @time 	: 下午2:17:03
* @version 	: V-0.0.1
* @description	: 桥接模式演示
*/
public class BridgeClient {

	public static void main(String[] args) {
		//画一个白色的正方形
		Color white = new White();
		Shape square = new Square();
		square.setColor(white);
		square.draw();
		
		//画一个黑色的圆形
		Color black = new Black();
		Shape circle = new Circle();
		circle.setColor(black);
		circle.draw();
	}

}
