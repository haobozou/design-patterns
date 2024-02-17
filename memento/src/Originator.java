public class Originator {
    private State state;

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.state;
    }

    public class Memento {
        private final State state;

        private Memento(State state) {
            this.state = state;
        }
    }
}