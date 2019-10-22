
/*************************************************
 * Title ParksideTriangle.java  Date: 2019/10/20
 * 
 * Author: Tyler Wang
 * 
 * Description: Prints out the Parkside's Triangle
 *  with a user suppled seed and size.
 */
import java.util.Scanner;

public class ParksideTriangle
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        
        //user input phase
        System.out.println("Enter the size then followed by the seed");
        int size = keyboard.nextInt();
        int seed = keyboard.nextInt();
        
        int nextNum;
        
        //loop for printing the triangle
        for(int a = size; a > 0; a--)
        {
            nextNum = seed;
            
            //prints the space preceeding the numbers
            for(int b = 0; b < size - a; b++)
                System.out.print(" ");
            
            //prints the numbers according to the pattern of Parkside's triangle
            for(int b = 0; b < a; b++)
            {    
                System.out.print(nextNum);
                nextNum += b + (size + 1) - a;
                if(nextNum > 9)
                    nextNum = (nextNum%10) + (nextNum/10);
            }
            System.out.println();
            
            //munipulating seed for next iteration
            seed += (size+2) - a;
            if(seed > 9)
                    seed = (seed%10) + (seed/10);
        }
    }
}