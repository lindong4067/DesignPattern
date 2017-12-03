package _03_singleton_pattern;

public class SingletonPattern {

	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.message();
	}

}
