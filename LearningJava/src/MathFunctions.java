import java.util.Scanner;

public class MathFunctions
{
    public static void main(String[] args)
    {
//        System.out.println(Math.PI); // gives the constant pi
//        System.out.println(Math.E); // gives the constant euler's number

//        double result;
//        result = Math.pow(2,3); x to the nth power
//        result = Math.abs(-5); absolute value
//        result = Math.sqrt(10); square root
//        result = Math.round(3.14); rounds to the nearest whole number
//        result = Math.ceil(3.14); rounds to the next whole number
//        result = Math.floor(Math.E); rounds down to the previous whole number
//        result = Math.max(10,20); gives the maximum number in that set
//        result = Math.min(10,32); gives the minimum number in that set



        // HYPOTENUSE (c) = Math.sqrt(Math.pow(a,2) + Math.pow(b,2))

//        Scanner scanner = new Scanner(System.in);
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the length of side a: ");
//        a = scanner.nextDouble();
//        System.out.print("Enter the length of side b: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//        System.out.println("The length of the hypotenuse is: " + c);
//
//        scanner.close();

        // CIRCLES
        // CIRCUMFERENCE = 2 * Math.PI * radius
        // AREA = Math.PI * Math.pow(radius, 2)
        // VOLUME = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference of the circle is: %.2f units.\n", circumference);
        System.out.printf("The area of the circle is: %.2f units².\n", area);
        System.out.printf("The volume of the circle is: units³.\n", volume);

        scanner.close();
    }
}
