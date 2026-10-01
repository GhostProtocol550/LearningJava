import java.util.Scanner;

public class CompoundInterest
{
    public static void main(String[] args)
    {
        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double finalAmount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in a %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        finalAmount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The final amount after %d is: $%.2f\n", years, finalAmount);


        scanner.close();

    }
}
