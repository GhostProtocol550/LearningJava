// thanks to BroCode on yt for the tutorials

import java.util.Scanner;
public class Bank
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        // 1. declare variables
        // 2. print a menu
        // 3. get and process user's choice
        // 4. create method -> showBalance()
        // 5. create method -> deposit()
        // 6. create method -> withdraw()
        // 7. print exit message

        double balance = 0;
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            System.out.println("***************");
            System.out.println("WELCOME TO THE BANK");
            System.out.println("***************");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT ");
            System.out.println("***************\n");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("***************");
        System.out.println("Thank you, have a nice day!");
        scanner.close();
    }
    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit() {
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if(amount < 0)
        {
            System.out.println("Your amount can't be negative!\n");
        }
        else
        {
            return amount;
        }
        return 0;
    }
    static double withdraw(double balance)
    {
        double amount;
        System.out.println("Enter an amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if (amount > balance)
        {
            System.out.println("Insufficient funds!\n");
            return 0;
        }
        else if (amount < 0)
        {
            System.out.println("Amount can't be negative!");
            return 0;
        }
        else
        {
            return amount;
        }
    }
}
