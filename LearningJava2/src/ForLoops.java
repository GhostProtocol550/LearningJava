import java.util.Scanner;

public class ForLoops
{
    public static void main(String[] args)
    {
        // for loop = execute some code a KNOWN amount of times

//        for (int i = 1; i < 10; i+=2) // for (index/counter; condition; update index/counter)
//        {
//            System.out.println(i);
//        }



//        System.out.print("Enter how many times you want to loop: ");
//        int max = scanner.nextInt();
//
//        for (int i = 0; i < max; i++)
//        {
//            System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to count down from?: ");

        int start = scanner.nextInt();
        for (int i = start; i > 0; i--)
        {
            System.out.println(i);
//            Thread.sleep(1000); // waits 1 second before printing each succeeding number
        }
        System.out.println("HAPPY NEW YEAR!!");
        scanner.close();
    }
}
