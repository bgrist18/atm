import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Atm {
    static Scanner scanner = new Scanner(System.in);

    static HashMap<String, Customer> data = new HashMap<>();
    private Scanner password;

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome ValuedCustomer");

        data.put("Alice", new Customer("Alice", 100.00, "123"));
        data.put("Bob", new Customer("Bob", 200.00, "asdf"));
        data.put("Charlie", new Customer("Charlie", 300.00, "qwerty"));

        boolean keepRunning = true;

        while (keepRunning) {
            String name1 = chooseName();

            Customer customer = data.get(name1);
            customer.selectOption();


            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                keepRunning = false;
            }
        }
    }

    public static String chooseName() {
        System.out.println("What is your name?");
        String nameTypedIn = scanner.nextLine();
        if (!data.containsKey(nameTypedIn)) {
            System.out.println("Please enter your new Username");
            String typedInName = scanner.nextLine();
            System.out.println("Please enter your new password");
            String newPassword = scanner.nextLine();
            data.put(typedInName, new Customer(typedInName, 100.00, newPassword));
            System.out.println("Welcome " + typedInName + "!");
        }

        if (nameTypedIn.equalsIgnoreCase("")) {
            System.out.println("userNameDoesNotExist");
        } else {
            System.out.println("Welcome, " + nameTypedIn);
        }

        return nameTypedIn;

    }
}