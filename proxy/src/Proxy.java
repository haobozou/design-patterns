public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        this.realSubject.request();
    }
}