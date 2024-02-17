public class Context {
    private State state;

    public void request() {
        this.state.handle(this);
    }
}