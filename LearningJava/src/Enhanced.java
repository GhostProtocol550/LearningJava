import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Enhanced
{
    public static void main(String[] args)
    {
        // enhanced switch = a replacement to many else if statements

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();


        switch(day) 
        {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day + " is not a day");
        }
    }
}
