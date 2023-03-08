import java.util.Map;
public class View implements Command{
    private final Map<Integer, String> map;

    public View(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void execute() {

        System.out.println("\nList of books");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        if(map.isEmpty()){
            System.out.println("No books stored yet.");
        }
    }
}
