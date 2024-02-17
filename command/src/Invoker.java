public class Invoker {
    private Command command;

    public void request() {
        this.command.execute();
    }
}