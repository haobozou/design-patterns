public class ConcreteObserver implements Observer {
    private ConcreteSubject concreteSubject;
    private State state;

    @Override
    public void update() {
        this.state = this.concreteSubject.getState();
    }
}