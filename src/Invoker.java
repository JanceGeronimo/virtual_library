import java.util.Map;
import java.util.HashMap;
public class Invoker {
    private final Map<String, Command> commands = new HashMap<>();

    public void addBook(String name, Command command) {
        commands.put(name, command);
    }

    public void executeBook(String name) {
        Command command = commands.get(name);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Command not found.");
        }
    }
}
