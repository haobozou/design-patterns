public abstract class AbstractClass {
    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }

    abstract protected void primitiveOperation1();

    abstract protected void primitiveOperation2();
}