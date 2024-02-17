public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}