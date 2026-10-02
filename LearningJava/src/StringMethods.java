// thanks to Bro Code on YouTube for the tutorials :D

import java.util.Locale;

public class StringMethods
{
    public static void main(String[] args)
    {
        String name = "GhostProtocol550";
//        int length = name.length(); gives you the length of the string
//        char letter = name.charAt(0); gives you the character at a given index
//        int index = name.indexOf("o"); // gives you the first index
//        int lastIndex = name.lastIndexOf("e"); // gives you the last index

        // name = name.toUpperCase(); changes all characters to uppercase
        // name = name.toLowerCase(); changes all characters to lowercase
        // name = name.trim(); removes any uncessary/unwanted spaces
        // name = name.replace("e", "g"); replaces the first given character with the second given character

        /*
        if (name.isEmpty())
        {
            System.out.println("Your name is empty.");
        }
        else
        {
            System.out.println("Hello, " + name);
        {
        */

        /*
        if (name.contains(" "))
        {
            System.out.println("Your name contains a space.");
        }
        else
        {
            System.out.println("Your name doesn't contain any spaces.");
        }
        */

        if (name.equalsIgnoreCase("password"))
        {
            System.out.println("Your name can't be password.");
        }
        else
        {
            System.out.println("Hello, " + name);
        }
    }
}
