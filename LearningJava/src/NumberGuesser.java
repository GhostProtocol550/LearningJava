// thanks to Bro Code on YouTube for the tutorials :D

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 1000001;
        int ranNum = random.nextInt(min, max); // 1st # = inclusive, 2nd # = exclusive

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < ranNum)
            {
                System.out.println("Your guess was too low, try again.");
            }
            else if (guess > ranNum)
            {
                System.out.println("Your guess was too high, try again.");
            }
            else
            {
                System.out.println("You have guessed the number!");
                System.out.println("You took " + attempts + " attempts to guess it!");
            }
        } while(guess != ranNum);

        scanner.close();
    }
}
