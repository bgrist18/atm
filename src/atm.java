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
            if (answer.equalsIgnoreCase("n")) {
                keepRunning = false;
            }
        }
    }
}