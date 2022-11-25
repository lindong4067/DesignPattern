package _02_abstract_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月20日	
* @time 	: 下午4:38:59
* @version 	: V-0.0.1
* @description	: 车身蓝色
*/
public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("喷涂：为车身喷涂蓝色……");
	}

}
