public abstract class Creator {
    protected abstract Product factoryMethod();

    public final void operation() {
        Product product = factoryMethod();
    }
}