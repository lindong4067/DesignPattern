package _02_abstract_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月20日	
* @time 	: 下午4:50:52
* @version 	: V-0.0.1
* @description	: 喷涂工厂
*/
public class ColorFactory extends AbstractFactory {

	@Override
	Model getModel(String model) {
		return null;
	}

	@Override
	Color getColor(String color) {
		if(color == null) {
			return null;
		}
		if(color.equalsIgnoreCase("Red")) {
			return new Red();
		} else if(color.equalsIgnoreCase("Blue")) {
			return new Blue();
		}
		return null;
	}

}
