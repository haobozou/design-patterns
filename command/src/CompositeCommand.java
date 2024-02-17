import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands;

    @Override
    public void execute() {
        for (Command command : this.commands) {
            command.execute();
        }
    }

    public void add(Command command) {
        this.commands.add(command);
    }

    public void remove(Command command) {
        this.commands.remove(command);
    }
}