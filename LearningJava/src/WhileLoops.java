import java.util.Scanner;

public class WhileLoops
{
    public static void main(String[] args)
    {
        // while loop = repeat some code forever as long as a condition is true
//        Scanner scanner = new Scanner(System.in);
//
//        String name = "";
//
//        while (name.isEmpty())
//        {
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//        System.out.println("Hello, " + name);
//
//        scanner.close();

//        while (1 == 1) // demonstrates infinite loop
//            // nothing to update the condition and break out of loop; remains true forever
//        {
//            System.out.println("HELP! I'M STUCK IN A LOOP");
//        }



//        String response = "";
//        while (!response.equals("Q"))
//        {
//            System.out.println("You are playing a game.");
//            System.out.print("Press Q to quit: ");
//            response = scanner.next().toUpperCase();
//        }
//        System.out.println("You have quit the game.");


//        int age = 0;
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();
//
//        while (age < 0)
//        {
//            System.out.println("Your age can't be negative!");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        }
//        System.out.println("You are " + age + " years old.");
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        int num = 0;

        do { // does the code first
            System.out.print("Enter a number between 1-10: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 10); // then checks this condition

        System.out.println("You picked "  + num);
    }
}
