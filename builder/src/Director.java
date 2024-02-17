import java.util.List;

public class Director {
    private List<Object> objects;

    public void construct(Builder builder) {
        for (Object object : this.objects) {
            builder.buildPart(object);
        }
    }
}