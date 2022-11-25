package _04_builder_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月21日	
* @time 	: 上午10:43:43
* @version 	: V-0.0.1
* @description	: 蔬菜汉堡
*/
public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.00F;
	}

}
