import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Map<Integer, String> map = new HashMap<>();
//        Invoker invoker = new Invoker();
//
//        invoker.addBook("add", new Add(map, 1, "Harry Potter"));
//        invoker.addBook("add", new Add(map, 2, "Lord of the Rings"));
//        invoker.addBook("add", new Add(map, 3, "The Notebook"));
//
//        invoker.addBook("remove", new Remove(map, 0));
//        invoker.addBook("view", new View(map));
//
//        invoker.executeBook("add");
//        invoker.executeBook("remove");
//        invoker.executeBook("view");

        Map<Integer, String> map = new HashMap<>();
        Invoker invoker = new Invoker();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter action (add, remove, view, quit): ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            switch (input) {
                case "add":

                    int key = map.size() + 1;

                    System.out.print("\nEnter book name you want to add: ");
                    String value = scan.nextLine();

                    invoker.addBook("add", new Add(map, key, value));

                    break;

                case "remove":
                    System.out.print("\nEnter book ID you want to remove: ");
                    key = scan.nextInt();
                    scan.nextLine(); // consume newline

                    invoker.addBook("remove", new Remove(map, key));

                    break;

                case "view":
                    invoker.addBook("view", new View(map));

                    break;

                default:
                    System.out.println("Invalid command.");
                    break;
            }

            invoker.executeBook(input);
        }

        scan.close();
    }
}