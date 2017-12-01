package _02_abstract_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月20日	
* @time 	: 下午4:33:48
* @version 	: V-0.0.1
* @description	: 甲壳虫款式
*/
public class Beetle implements Model {

	@Override
	public void forge() {
		System.out.println("锻造：锻造一个甲壳虫的车型！");
	}

}
