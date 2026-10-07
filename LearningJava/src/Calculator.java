// thanks to Bro Code on YouTube for the tutorials :D

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char oper;
        double result = 0;
        boolean validOper = true;

        System.out.print("Enter the 1st number: ");
        num1 = scanner.nextDouble();
        System.out.print("Choose the operator (+, -, *, /, ^): ");
        oper = scanner.next().charAt(0); // gets the first character
        System.out.print("Enter the 2nd number: ");
        num2 = scanner.nextDouble();

        switch (oper)
        {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {if (num2 == 0){
                System.out.println("Cannot divide by 0.");
                validOper = false;
            }
            else{
                result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator");
                validOper = false;
            }
        }
        if (validOper)
        {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }


}
