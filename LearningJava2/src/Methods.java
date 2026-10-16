// thanks to BroCode on yt for the tutorials
public class Methods
{
    public static void main(String[] args)
    {
        // method = a block of reusable code that is executed when called ()

        int age = 21;
        if (confirmAge(age))
        {
            System.out.println("You may sign up!");
        }
        else
        {
            System.out.println("You need to be 18+ to sign up.");
        }
    }

    static double computeSquare(double num)
    {
        return num * num;
    }
    static double computeCube (double num)
    {
        return num * num * num;
    }
    static String getName(String first, String last)
    {
        return first + " " + last;
    }
    static boolean confirmAge(int age)
    {
        if (age >= 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
