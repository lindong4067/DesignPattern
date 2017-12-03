package _03_singleton_pattern;

public class SingleObject {
	private static SingleObject object = new SingleObject();
	private SingleObject() {
		
	}
	public static SingleObject getInstance() {
		return object;
	}
	public void message() {
		System.out.println("Hello！");
	}
}
