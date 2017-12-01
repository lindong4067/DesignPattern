package _04_builder_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月21日	
* @time 	: 上午10:30:36
* @version 	: V-0.0.1
* @description	: 包装纸
*/
public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}
