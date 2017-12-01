package _02_abstract_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月20日	
* @time 	: 下午4:45:12
* @version 	: V-0.0.1
* @description	: 车型工厂
*/
public class ModelFactory extends AbstractFactory {

	@Override
	public Model getModel(String model) {
		if(model == null) {
			return null;
		}
		if(model.equalsIgnoreCase("Beetle")) {
			return new Beetle();
		} else if(model.equalsIgnoreCase("Iveco")) {
			return new Iveco();
		}
		return null;
		
	}

	@Override
	public Color getColor(String color) {
		return null;
	}

}
