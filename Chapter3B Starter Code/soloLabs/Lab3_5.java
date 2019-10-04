package soloLabs;

import java.util.Scanner;

public class Lab3_5
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        final String i_string = keyboard.nextLine();
        
        //prints the string backwards
        for(int a = i_string.length() - 1; a >= 0; a--)
            System.out.print(i_string.charAt(a));
        System.out.println();
        //prints all of the upper case letters
        for(int a = 0; i_string.length() > a; a++)
            if(i_string.charAt(a) >= 65 && i_string.charAt(a) <= 90)
                System.out.print(i_string.charAt(a));
        System.out.println();
        //replacing the vowels with underscores
        String string = i_string.toLowerCase();
        string = string.replace('a','_');
        string = string.replace('e','_');
        string = string.replace('i','_');
        string = string.replace('o','_');
        string = string.replace('u','_');
        
        System.out.println(string);
        //counts all of the vowels
        int vowels = 0;
        for(int a = 0; string.length() > a; a++)
            if(string.charAt(a) == '_')
                vowels++;
        System.out.println("You have " + vowels + " vowles.");
    }
}