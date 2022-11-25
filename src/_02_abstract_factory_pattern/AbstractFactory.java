package _02_abstract_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月20日	
* @time 	: 下午4:41:30
* @version 	: V-0.0.1
* @description	: 静态工厂类
*/
public abstract class AbstractFactory {
	abstract Model getModel(String model);
	abstract Color getColor(String color);
}
