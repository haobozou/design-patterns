public class ConcreteSubject extends Subject {
    private State state;

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
        super.notifyObservers();
    }
}