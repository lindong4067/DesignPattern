package _03_singleton_pattern;

public class Singleton03 {
	private volatile static Singleton03 singleton;  
    private Singleton03 (){}  
    public static Singleton03 getSingleton() {  
    if (singleton == null) {  
        synchronized (Singleton03.class) {  
        if (singleton == null) {  
            singleton = new Singleton03();  
        }  
        }  
    }  
    return singleton;  
    }  
}
