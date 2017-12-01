package _04_builder_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月21日	
* @time 	: 上午10:50:36
* @version 	: V-0.0.1
* @description	: 百事可乐
*/
public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 35.00F;
	}

}
