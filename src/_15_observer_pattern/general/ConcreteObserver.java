package _15_observer_pattern.general;

public class ConcreteObserver implements Observer {
    private int value;
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("value is: " + value);
    }
}
