package _03_singleton_pattern;
/**
 * 饿汉式
 * @author 赵临冬
 *
 */
public class Singleton02 {
	private static Singleton02 instance = new Singleton02();  
    private Singleton02 (){}  
    public static Singleton02 getInstance() {  
    return instance;  
    }  
}
