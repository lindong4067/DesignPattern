package _01_factory_pattern;
/**
* @author 	: lyndon
* @Email 	: lindong4067
* @date		: 2017年11月20日	
* @time 	: 下午3:07:40
* @version 	: V-0.0.1
* @description	: 
*/
public class Test {
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello World !");
	}
	public static Object getTest(Class<?> clazz) {
		Object obj = null;
		try {
			obj = Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		Test test = (Test) Test.getTest(Test.class);
		test.hello();
	}
}
