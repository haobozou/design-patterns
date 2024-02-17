import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> items;

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator<T> {
        private int current;

        public ConcreteIterator() {
            this.current = 0;
        }

        @Override
        public void first() {
            this.current = 0;
        }

        @Override
        public void next() {
            this.current++;
        }

        @Override
        public boolean isDone() {
            return this.current >= items.size();
        }

        @Override
        public T currentItem() {
            return items.get(this.current);
        }
    }
}