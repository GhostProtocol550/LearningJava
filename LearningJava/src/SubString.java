// thanks to Bro Code on YouTube for the tutorials :D

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;


public class SubString
{
    public static void main(String[] args)
    {
        // .substring() = a method used to extract a portion of a string
        // string.substring(start, end)

        Scanner scanner = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");


        email = scanner.nextLine();
        if (email.contains("@"))
        {
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Your username is: " + username);
            System.out.println("Your domain is: " + domain);
        }
        else
        {
            System.out.println("Your email must contain @! 😡");
        }

        scanner.close();
    }

}
