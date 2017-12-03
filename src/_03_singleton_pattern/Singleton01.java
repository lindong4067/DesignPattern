package _03_singleton_pattern;
/**
 * 懒汉式
 * @author 赵临冬
 *
 */
public class Singleton01 {
	private static Singleton01 instance;
	private Singleton01() {
		
	}
	public static synchronized Singleton01 getInstance() {
		if(instance == null) {
			instance = new Singleton01();
		}
		return instance;
	}
}
