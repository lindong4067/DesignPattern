package _04_builder_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月21日	
* @time 	: 上午10:47:55
* @version 	: V-0.0.1
* @description	: 可口可乐
*/
public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 30.00F;
	}

	@Override
	public String name() {
		return "Coke";
	}

}
