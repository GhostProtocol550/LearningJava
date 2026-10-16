import java.util.Scanner;
// thanks to BroCode on yt for the tutorials

public class NestLoops
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}

// for (int a = 1; a <= 3; a++)
//        {
//            for (int i = 1; i <= 9; i++)
//            {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }