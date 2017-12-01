package _11_facade_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月23日	
* @time 	: 上午11:08:57
* @version 	: V-0.0.1
* @description	: 外观模式：对客户屏蔽子系统的组件
*/
public class FacadePattern {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
