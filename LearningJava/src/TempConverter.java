// inspired by Bro Code's TempConverter tutorial program

import java.util.Scanner;

public class TempConverter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.println("Welcome to the Temperature Converter program!");


        System.out.println("\nChoose your conversion process below.");
        System.out.println("Option F: Celsius to Fahrenheit");
        System.out.println("Option C: Fahrenheit to Celsius");
        System.out.println("Option K: Celsius to Kelvin");
        System.out.println("Option K-C: Kelvin to Celsius");
        System.out.println("Option F-K: Fahrenheit to Kelvin");
        System.out.print("Your choice: ");
        unit = scanner.next().toUpperCase(); // converts any character to uppercase


        if (unit.equals("F"))
        {
            System.out.print("Enter the temperature: ");
            temp = scanner.nextDouble();
            newTemp = (temp * 9 / 5) + 32;
            System.out.printf("\nNew temperature: %.2f°F", newTemp);
        }
        else if (unit.equals("C"))
        {
            System.out.print("Enter the temperature: ");
            temp = scanner.nextDouble();
            newTemp = (temp - 32) * 5 / 9;
            System.out.printf("\nNew temperature: %.2f°C", newTemp);
        }
        else if (unit.equals("K"))
        {
            System.out.print("Enter the temperature: ");
            temp = scanner.nextDouble();
            newTemp = temp + 273.15;
            System.out.printf("\nNew temperature: %.2fK", newTemp);
        }
        else if (unit.equals("K-C"))
        {
            System.out.print("Enter the temperature: ");
            temp = scanner.nextDouble();
            newTemp = temp - 273.15;
            System.out.printf("\nNew temperature: %.2f°C", newTemp);
        }
        else if (unit.equals("F-K"))
        {
            System.out.print("Enter the temperature: ");
            temp = scanner.nextDouble();
            newTemp = (temp - 32) * 5/9 + 273.15;
            System.out.printf("\nNew temperature: %.2fK", newTemp);
        }
        scanner.close();
    }
}
