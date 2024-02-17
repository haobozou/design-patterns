public class Singleton {
    private static Singleton uniqueInstance;
    private SingletonData singletonData;

    protected Singleton() {
    }

    public static Singleton instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public SingletonData getSingletonData() {
        return this.singletonData;
    }

    public void singletonOperation() {
    }
}