public class VariableScope
{
    static int x = 3; // class, known by both methods
    public static void main(String[] args)
    {
         int x = 1;  //local to main

        System.out.println(x);
        doSome();
    }

    static void doSome()
    {
        int x = 2; //local to doSome
        System.out.println(x);
    }
}
