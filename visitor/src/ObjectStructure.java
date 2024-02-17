import java.util.List;

public class ObjectStructure implements Element {
    private List<Element> elements;

    @Override
    public void accept(Visitor visitor) {
        for (Element element : this.elements) {
            element.accept(visitor);
        }
    }
}