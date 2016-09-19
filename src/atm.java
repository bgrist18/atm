import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class atm {
    static Scanner scanner = new Scanner(System.in);

    static HashMap<String, Customer> data = new HashMap<>();


    public static void main(String[] args) throws Exception {
        System.out.println("Welcome ValuedCustomer");

        data.put("Alice", new Customer("Alice", 100.00, "123"));
        data.put("Bob", new Customer("Bob", 200.00, "asdf"));
        data.put("Charlie", new Customer("Charlie", 300.00, "qwerty"));

        boolean keepRunning = true;

        while (keepRunning) {
            Customer customer = new Customer();
            customer.chooseName();
            customer.addNewUser();
            customer.selectOption();


            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                keepRunning = false;
            }
        }
    }
}
