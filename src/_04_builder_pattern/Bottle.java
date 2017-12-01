package _04_builder_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月21日	
* @time 	: 上午10:31:58
* @version 	: V-0.0.1
* @description	: 瓶子包装
*/
public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
