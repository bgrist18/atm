import java.util.*;

public class Customer {
    String name;
    double balance;
    //    String withdrawl;
//    String cancel;
//    String selectOption;
    String password;



    public Customer(String name, double balance, String withdrawl, String cancel, String selectOption, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public Customer() {
    }

    void addPassword(Customer customer) {
        System.out.println("Please enter a password");
        String pass = Atm.scanner.nextLine();
        customer.password = pass;
    }


    public void selectOption() throws Exception {
        System.out.println("Check Balance, Withdrawl, Cancel, Cashout");
        String option = Atm.scanner.nextLine();

        if (option.equalsIgnoreCase("balance")) {

            System.out.println("Your balance is " + balance);

        } else if (option.equalsIgnoreCase("withdrawl")) {
            System.out.println("How much would you like to withdrawl");
            String withdrawl = Atm.scanner.nextLine();
            int withdrawlNum = Integer.valueOf(withdrawl);
            if (withdrawlNum < 100) {

                System.out.println("Please take your money");

                balance = (balance - withdrawlNum);
                System.out.println("Your new balance is " + balance);
                System.out.println("WouldYouLikeToMakeAnotherTransaction");
                if (option.equalsIgnoreCase("yes")) {
                    System.out.println("loop");
                } else if (option.equalsIgnoreCase("no")) {
                    System.out.println("Thank you, Have a great day!");
                }
//            Customer customer = new Customer();

            } else {
                System.out.println("Insufficient funds");
            }

        } else if (option.equalsIgnoreCase("cancel")) {
            System.out.println("Thank you, Have a great day!");
        }
        else if (option.equalsIgnoreCase("cashout")){
            Atm.data.remove(this.name);
            System.out.println(name + " Thank you for your business");
        }
    }
}