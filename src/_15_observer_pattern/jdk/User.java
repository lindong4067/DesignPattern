package _15_observer_pattern.jdk;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        WechatServer server = (WechatServer) o;
        this.message = server.getMessage();
        read();
    }

    private void read() {
        System.out.println("I'm " + name + ", received message: " + message);
    }
}
