/**
 * Created by brettgrist on 9/14/16.
 */

public class Customer {
    String name;
    String balance;
    String withdrawl;
    String cancel;
    String selectOption;

    void chooseName(){
        System.out.println("What is your name?");
        name = atm.scanner.nextLine();
        System.out.println("Welcome, " + name);
    }
    void selectOption() throws Exception {
        System.out.println("Check Balance, Withdrawl, Cancel");
        String option = atm.scanner.nextLine();


        if (option.equalsIgnoreCase("balance")) {
            System.out.println("Your balance is $100");
        } else if (option.equalsIgnoreCase("withdrawl")) {
            System.out.println("How much would you like to withdrawl");
            String withdrawl = atm.scanner.nextLine();
            int withdrawlnum = Integer.valueOf(withdrawl);
            if (withdrawlnum<100){

                System.out.println("Please take your money");
            }
            else {
                System.out.println("Insufficient funds");
            }

        } else if (option.equalsIgnoreCase("cancel")){
            System.out.println("Thank you, Have a great day!");
        }

    }
}
