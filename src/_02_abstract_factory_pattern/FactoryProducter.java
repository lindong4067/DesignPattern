package _02_abstract_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月20日	
* @time 	: 下午4:55:03
* @version 	: V-0.0.1
* @description	: 工厂创造器
*/
public class FactoryProducter {
	
	public static AbstractFactory getFactory(String type) {
		if(type.equalsIgnoreCase("Model")) {
			return new ModelFactory();
		} else if(type.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		}
		return null;
	}
}
