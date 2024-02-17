public class ConcreteCommand implements Command {
    private Receiver receiver;

    @Override
    public void execute() {
        this.receiver.action();
    }
}