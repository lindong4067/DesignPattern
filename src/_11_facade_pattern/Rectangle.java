package _11_facade_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月23日	
* @time 	: 上午10:34:50
* @version 	: V-0.0.1
* @description	: 
*/
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("形状：矩形");
	}

}
