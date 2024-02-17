import java.util.Map;

public class FlyweightFactory {
    private Map<Key, Flyweight> flyweights;

    public Flyweight getFlyweight(Key key) {
        this.flyweights.putIfAbsent(key, new ConcreteFlyweight());
        return this.flyweights.get(key);
    }
}