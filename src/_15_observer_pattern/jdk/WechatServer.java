package _15_observer_pattern.jdk;

import java.util.Observable;

public class WechatServer extends Observable implements Server {
    private String message;
    @Override
    public void publish(String message) {
        this.message = message;
        this.setChanged();
        this.notifyObservers();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
