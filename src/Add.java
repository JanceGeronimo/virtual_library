import java.util.Map;
import java.util.HashMap;

public class Add implements Command{
    private final Map<Integer, String> map;
    private final int key;
    private final String value;

    public Add(Map<Integer, String> map, int key, String value) {
        this.map = map;
        this.key = key;
        this.value = value;

    }

    @Override
    public void execute() {
        map.put(key, value);
        System.out.println(value + " is added.");
    }

}
