import java.util.Scanner;
public class Palendrome
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a phase all in one line");
        String phrase = keyboard.nextLine();
        System.out.println();
        
        boolean pallendrome = true;
        String part1 = "d", part2 = "d";
        System.out.print(phrase);
        
        while(phrase.indexOf(' ') != -1)
        {
            part1 = phrase.substring(0 , phrase.indexOf(' '));
            part2 = phrase.substring(phrase.indexOf(' '));
            //phrase = part1 + part2;
        }
        
        for(int a = 0; a <= phrase.length()/2; a++)
            if(phrase.charAt(a) != phrase.charAt((phrase.length() - 1) - a))
            {
                pallendrome = false;
                break;
            }
            
        if(pallendrome)
            System.out.println(" is a pallendrome");
        else
            System.out.println(" isn't a pallendrome");
    }
}