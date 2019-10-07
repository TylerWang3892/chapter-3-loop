package soloLabs;

import java.util.Scanner;

public class subString
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        
        String word = keyboard.nextLine();
        
        for(int a = 0; a < word.length(); a++)
        {
            for(int b = a; b <= word.length(); b++)
                System.out.println(word.substring(a,b));
        }
    }
}
