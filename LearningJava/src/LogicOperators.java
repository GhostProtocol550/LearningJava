// thanks to Bro Code on YouTube for the tutorials :D

import java.util.Scanner;

public class LogicOperators
{
    public static void main(String[] args)
    {
        // && = AND - both conditions must be true
        // || OR - at least 1 condition must be true
        // ! = NOT - if something is NOT true

        Scanner scanner = new Scanner(System.in);
        // username must be between 4-12 characters
        // username cannot contain spaces or underscores
        String username;
        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12)
        {
            System.out.println("Username must be between 4-12 characters.");
        }
        else if (username.contains(" ") || username.contains("_"))
        {
            System.out.println("Username must not contain spaces or underscores");
        }
        else
        {
            System.out.println("Welcome " + username);
        }
        scanner.close();
    }
}
