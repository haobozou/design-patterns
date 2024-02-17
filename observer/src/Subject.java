import java.util.List;

public abstract class Subject {
    private List<Observer> observers;

    public void attachObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void detachObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}