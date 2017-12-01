package _07_bridge_pattern;

import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;

/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月22日	
* @time 	: 上午10:19:02
* @version 	: V-0.0.1
* @description	: 红圆圈的类
*/
public class RedCircle implements Draw{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("画了一个红圆圈，半径是：" + radius + "，圆心是：[" + x + "," + y + "]");
	}

}
