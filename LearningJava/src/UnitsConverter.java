// thanks to Bro Code on YouTube for the tutorials :D

import java.util.Scanner;

public class UnitsConverter
{
    // Weight Conversion Program
    // converts from lbs to kgs or vice versa

    // STEPS
    // 1. declare variables
    // 2. print welcome message
    // 3. prompt for user choice
    // 4. option 1: convert lbs to kgs
    // 5. option 2: convert kg to lbs

    // -- every thing after step 5 are my ideas
    // might add more units conversion options later...

    // 6. option 3: convert mL to L
    // 7. option 4: convert L to mL
    // 8. check if user complies with option choice with while loop
    // 9. if not, keeps asking for valid unput

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double unit;
        double newUnit;
        int choice;

        System.out.println("Welcome to the Weight Conversion Program!");
        System.out.println("Choose your conversion process below.");
        System.out.println("1: Convert from lb to kg");
        System.out.println("2: Convert from kg to lb");
        System.out.println("3: Convert from mL to L");
        System.out.println("4: Convert from L to mL");
        System.out.print("Your choice: ");
        choice = scanner.nextInt();


        while (choice <= 0 || choice >= 5) // checks if the user enters anything other than 1 or 2
        {
            System.out.println("\nThat is not a valid input. Pick again.");
            System.out.println("1: Convert from lb to kg");
            System.out.println("2: Convert from kg to lb");
            System.out.println("3: Convert from mL to L");
            System.out.println("4: Convert from L to mL");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
        }

        if (choice == 1)
        {
            System.out.print("Enter the weight in lb: ");
            unit = scanner.nextDouble();
            newUnit = unit * 0.453592;
            System.out.printf("The weight in kg is: %.3f kg\n", newUnit);
        }
        else if (choice == 2)
        {
            System.out.print("Enter the weight in kg: ");
            unit = scanner.nextDouble();
            newUnit = unit * 2.20462;
            System.out.printf("The weight in lb is: %.3f lb\n", newUnit);
        }
        else if (choice == 3)
        {
            System.out.print("Enter the volume in mL: ");
            unit = scanner.nextDouble();
            newUnit = unit * 0.001;
            System.out.printf("The volume in L is: %.3f L\n", newUnit);
        }
        else if (choice == 4)
        {
            System.out.print("Enter the volume in L: ");
            unit = scanner.nextDouble();
            newUnit = unit * 1000;
            System.out.printf("The volume in mL is: %.3f mL\n", newUnit);
        }
        scanner.close();
    }
}
