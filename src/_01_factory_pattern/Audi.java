package _01_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月20日	
* @time 	: 下午3:16:58
* @version 	: V-0.0.1
* @description	: 
*/
public class Audi implements Variety {

	@Override
	public void product() {
		System.out.println("生产了一辆奥迪！");
	}

}
