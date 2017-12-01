package _01_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月20日	
* @time 	: 上午9:07:58
* @version 	: V-0.0.1
* @description	: 工厂模式
*/
public class FruitsFactory {
	
	//生产水果的方法
	public Variety getFruit(String fruitType) {
		if(fruitType == null){
			return null;
		}
		if(fruitType.equalsIgnoreCase("Apple")){
			return new Apple();
		} else if(fruitType.equalsIgnoreCase("Banana")){
			return new Banana();
		} else if(fruitType.equalsIgnoreCase("Pear")){
			return new Pear();
		} else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		FruitsFactory fruitsFactory = new FruitsFactory();
		//获取Apple对象
		Variety apple = fruitsFactory.getFruit("Apple");
		apple.product();
		//获取Banana对象
		Variety banana = fruitsFactory.getFruit("Banana");
		banana.product();
		//获取梨子对象
		Variety pear = fruitsFactory.getFruit("Pear");
		pear.product();
	}

}
