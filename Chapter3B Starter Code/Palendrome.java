/*********************************************
 * Title: Palendrome.java   Date: 2019/10/20
 * 
 * Author: Tyler Wang
 * 
 * Description: tests if the user entered string
 *  is a palendrome.
 *********************************************/
import java.util.Scanner;
public class Palendrome
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        
        //collects user input
        System.out.println("Enter a phase all in one line");
        String phrase = keyboard.nextLine();
        System.out.println();
        
        boolean pallendrome = true;
        String part1 = "d", part2 = "d";
        System.out.print(phrase);
        
        //subtracts all of the spaces from the string
        phrase = phrase.replaceAll(" ", "");
        phrase = phrase.toUpperCase();
        
        //tests whether the string is a palendrome
        for(int a = 0; a <= phrase.length()/2; a++)
            if(phrase.charAt(a) != phrase.charAt((phrase.length() - 1) - a))
            {
                pallendrome = false;
                break;
            }
            
        //prints final output
        if(pallendrome)
            System.out.println(" is a pallendrome");
        else
            System.out.println(" isn't a pallendrome");
    }
}