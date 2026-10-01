import java.util.Random;
import java.util.Scanner;

public class RandomNum
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        boolean integer;
        boolean wantDecimal;
        double decimal;

        System.out.print("Do you want 3 integers? (true/false): "); // asks the user if they want 3 random integers
        integer = scanner.nextBoolean();
        if (integer)
        {
            // first number = inclusive, second number is exclusive
            number1 = random.nextInt(1,7);
            number2 = random.nextInt(1,7);
            number3 = random.nextInt(1,7);

            System.out.println(number1 + ", " + number2 + ", " + number3);
        }

        // then asks if the user wants a decimal after integers
        System.out.print("Do you want 1 decimal? (true/false): ");
        wantDecimal = scanner.nextBoolean();

        if (wantDecimal)
        {
            decimal = random.nextDouble();
            System.out.println(decimal);
        }
    }
}
