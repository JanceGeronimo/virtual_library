import java.util.Map;

public class Remove implements Command{

    private final Map<Integer, String> map;
    private final Integer key;

    public Remove(Map<Integer, String> map, Integer key) {
        this.map = map;
        this.key = key;
    }

    @Override
    public void execute() {
        if(map.containsKey(key)){
            map.remove(key);
            System.out.println("Book ID: " + key + " is removed");
        }
        else {
            System.out.println("Book not found.");
        }
    }
}
