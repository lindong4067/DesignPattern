package _04_builder_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月21日	
* @time 	: 上午10:41:04
* @version 	: V-0.0.1
* @description	: 冷饮抽象类(可以不用全部实现接口中的方法，留给子类实现)
*/
public abstract class ColdDrink implements Item {

//	@Override
//	public String name() {
//		return null;
//	}

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
