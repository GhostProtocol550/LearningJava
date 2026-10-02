// thanks to Bro Code on YouTube for the tutorials :D
import java.util.Scanner;


public class NestedIfs
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isStudent;
        boolean isSenior;
        double price = 23.99;

        System.out.print("Are you a student (true/false)? ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you senior (true/false)? ");
        isSenior = scanner.nextBoolean();

        if(isStudent)
        {
            if (isSenior)
            {
                price *= 0.7;
                System.out.println("You get a student and senior discount of 30%!");
            }
            else
            {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else
        {
            if (isSenior)
            {
                System.out.println("You get a senior discount of 20%!");
                price *= 0.8;
            }
            else
            {
                price *= 1;
            }
        }
        System.out.printf("The price of a ticket is now: $%.2f", price);

        scanner.close();
    }
}
