package _02_abstract_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月20日	
* @time 	: 下午4:59:35
* @version 	: V-0.0.1
* @description	: 抽象工厂模 式
*/
public class AbstractFactoryPattern {

	public static void main(String[] args) {
		//车型工厂
		AbstractFactory modelFactory = FactoryProducter.getFactory("Model");
		Model beetle = modelFactory.getModel("Beetle");
		beetle.forge();
		Model iveco = modelFactory.getModel("Iveco");
		iveco.forge();
		
		//喷涂工厂
		AbstractFactory colorFactory = FactoryProducter.getFactory("Color");
		Color red = colorFactory.getColor("Red");
		red.fill();
		Color blue = colorFactory.getColor("Blue");
		blue.fill();
	}

}
