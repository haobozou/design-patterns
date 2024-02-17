import java.util.Deque;

public class Caretaker {
    private Originator originator;
    private Deque<Originator.Memento> history;

    public void save() {
        Originator.Memento memento = this.originator.createMemento();
        this.history.push(memento);
    }

    public void restore() {
        Originator.Memento memento = this.history.pop();
        this.originator.setMemento(memento);
    }
}