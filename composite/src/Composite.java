import java.util.List;

public class Composite implements Component {
    private List<Component> children;

    @Override
    public void operation() {
        for (Component child : this.children) {
            child.operation();
        }
    }

    public void add(Component component) {
        this.children.add(component);
    }

    public void remove(Component component) {
        this.children.remove(component);
    }

    public Component getChild(int index) {
        return this.children.get(index);
    }
}