import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by brettgrist on 9/14/16.
 */

public class atm {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome ValuedCustomer");

        boolean keepRunning = true;

        while (keepRunning) {
            Customer customer = new Customer();
            customer.chooseName();
            customer.selectOption();


            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                keepRunning = false;
            }
        }
    }
    {ArrayList<String> names2 = new ArrayList();
        names2.add("Alice");
        names2.add("Bob");
        names2.add("Charlie");
        names2.remove(1);
        System.out.println(names2);

    HashMap<String, Object> person = new HashMap();
        person.put("name", "Alice");
        person.put("passord", "asdf");
        person.put("name", "Bob");
        person.put("password", "1234");
        person.put("name", "Charlie");
        person.put("password", "qwerty");

        if (option.equalsIgnoreCase("balance")) {
            System.out.println("Your balance is " + balance);
}