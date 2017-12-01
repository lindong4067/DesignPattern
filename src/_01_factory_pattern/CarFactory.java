package _01_factory_pattern;

/**
* @author 	: lyndon
* @Email 	: zhao.lindong@zhgtv.cn
* @date		: 2017年11月20日	
* @time 	: 下午1:37:14
* @version 	: V-0.0.1
* @description	: 利用反射解决每次增加对象时都需要修改工厂的问题
*/
public class CarFactory {
	
	//生产汽车的方法(使用反射)
	public static Object getCar(Class<? extends Variety> clazz) {
		Object obj = null;
		try {
			obj = Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		
		Variety audi = (Variety) CarFactory.getCar(Audi.class);
		audi.product();
		
		Variety honda = (Variety) CarFactory.getCar(Honda.class);
		honda.product();
		
		Variety jeep = (Variety) CarFactory.getCar(Jeep.class);
		jeep.product();
		
	}
}
