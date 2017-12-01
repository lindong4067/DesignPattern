package _07_bridge_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月22日	
* @time 	: 上午10:22:41
* @version 	: V-0.0.1
* @description	: 绿圆圈的类
*/
public class GreenCircle implements Draw {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("画了一个绿圆圈，半径是：" + radius + "，圆心是：[" + x + "," + y + "]");
	}

}
