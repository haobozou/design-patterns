public class ConcreteBuilder implements Builder {
    private Product result;

    @Override
    public void buildPart(Object object) {
    }

    public Product getResult() {
        return this.result;
    }
}