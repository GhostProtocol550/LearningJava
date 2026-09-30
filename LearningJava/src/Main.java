import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.print("Enter a second adjective: ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb (ending with -ing): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter a third adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a " + adjective1 + " birthday party.");
        System.out.println("In the living room, I saw " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was very " + adjective3 + "...");

        scanner.close();
    }
}
