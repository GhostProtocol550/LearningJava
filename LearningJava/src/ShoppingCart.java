import java.util.Scanner;

public class ShoppingCart
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each of your item?: ");
        price = scanner.nextDouble();

        System.out.print("How many do you want to purchase?: ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println("\nYou have bought " + quantity + " " + item + "[s].");
        System.out.println("The total price is: " + currency + total);

        scanner.close();
    }
}
