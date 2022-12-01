package _15_observer_pattern.general;

public class Example {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver(subject);

        observer.display();
        subject.setValue(100);
        observer.display();
        subject.removeObserver(observer);
    }
}
