import javax.swing.*;
import java.util.Scanner;

public class IfStatements
{
    public static void main(String[] args)
    {
        // if statement = performs a line of code if its condition is true (booleans)

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;

        System.out.print("What is your name?: ");
        name = scanner.nextLine();

        System.out.print("How old are you?: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();
        // Group 1 (name)
        if (name.isEmpty())
        {
            System.out.println("You didn't enter your name! 😡");
        }
        else
        {
            System.out.println("Hello, " + name + "! 😊");
        }

        // Group 2 (age)
        if (age >= 65)
        {
            System.out.println("You are unc! 👴");
        }
        else if (age >= 18)
        {
            System.out.println("You are an adult!");
        }
        else if (age < 0)
        {
            System.out.println("You haven't been born yet! 👻");
        }
        else if (age == 0)
        {
            System.out.println("You are a bebe (lol)! 👶");
        }
        else
        {
            System.out.println("You are a child! 🧒");
        }

        // Group 3 (student)

        if (isStudent)
        {
            System.out.println("You are also a student! 🏫");
        }
        else
        {
            System.out.println("You are not a student.");
        }
        scanner.close();
    }
}
