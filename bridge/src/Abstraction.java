public abstract class Abstraction {
    private Implementor implementor;

    public void operation() {
        this.implementor.operationImp();
    }
}