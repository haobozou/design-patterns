public abstract class Handler {
    private Handler successor;

    public void handleRequest() {
        if (this.successor != null) {
            this.successor.handleRequest();
        }
    }
}