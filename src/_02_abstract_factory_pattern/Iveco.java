package _02_abstract_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月20日	
* @time 	: 下午4:36:11
* @version 	: V-0.0.1
* @description	: 依维柯车款
*/
public class Iveco implements Model {

	@Override
	public void forge() {
		System.out.println("锻造：锻造一个依维柯的车型！");
	}

}
