import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class atm {
    static Scanner scanner = new Scanner(System.in);

    static HashMap<String, Customer> data = new HashMap<>();
    private Scanner password;

    public static String chooseName() {
        System.out.println("What is your name?");
        String nameTypedIn = scanner.nextLine();
        System.out.println("Please enter your password");

        String typedInName = scanner.nextLine();

        if (!data.containsKey(nameTypedIn)) {


            if (nameTypedIn.equalsIgnoreCase("")) {
                System.out.println("userNameDoesNotExist");
            } else {
                System.out.println("Welcome, " + nameTypedIn);
            }

            System.out.println("Please enter your new Username");
            typedInName = scanner.nextLine();
            System.out.println("Please enter your new password");
            String newPassword = scanner.nextLine();

            data.put(typedInName, new Customer(typedInName, 100.00, newPassword));
            System.out.println("Welcome " + typedInName + "!");
        }
        return nameTypedIn;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome ValuedCustomer");
        String name;

        data.put("Alice", new Customer("Alice", 100.00, "123"));
        data.put("Bob", new Customer("Bob", 200.00, "asdf"));
        data.put("Charlie", new Customer("Charlie", 300.00, "qwerty"));

        boolean keepRunning = true;

        while (keepRunning) {
            String name1 = chooseName();

            Customer customer = data.get(name1);
            customer.selectOption(data );


            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                keepRunning = false;
            }
        }
    }
}
