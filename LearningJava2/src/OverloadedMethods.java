public class OverloadedMethods
{
    // overloaded methods = methods that share the same name, but different parameter
    // signature = name + parameters
    public static void main(String[] args)
    {
        String pizza = bakePizza("flatbread", "mozzarella", "pepporoni");
        System.out.println(pizza);
    }
    static String bakePizza(String bread)
    {
        return  bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping)
    {
        return  topping + " " + cheese + " " + bread + " pizza";
    }
}

//    static double add(double a, double b)
//    {
//        return a + b;
//    }
//    static double add(double a, double b, double c)
//    {
//        return a + b + c;
//    }