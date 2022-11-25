package _15_observer_pattern.jdk;

public class Client {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();
        server.addObserver(new User("Zhang San"));
        server.addObserver(new User("Li Si"));
        server.addObserver(new User("Wang Wu"));
        server.publish("Who is that?");
    }
}
