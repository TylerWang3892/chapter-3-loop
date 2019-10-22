/***************************************************
 * Title: Fibonacci.java     Date: 2019/10/20
 * 
 * Author: Tyler Wang
 * 
 * Description: Prints out the user requested amount
 *  of fibonacci numbers
 ***************************************************/
import java.util.Scanner;

public class Fibonacci
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        
        //collecting user input
        System.out.println("Enter the amount of digits you want to output.");
        int numofNumbers = keyboard.nextInt();
        
        int previous = 1, twoBefore = 0, buffer = 0;
        
        
        for(int a = 0; numofNumbers > a; a++)
        {
            //if first time running loop, will print a "0"
            if(a ==0)
                System.out.print(twoBefore + " ");
                
            //if second time running loop, will print a "1"
            else if(a == 1)
                System.out.print(previous + " ");
                
            //will print out previous + twobefore
            else
            {
                System.out.print(twoBefore + previous + " ");
                
                //updates previous and two Before for next iteration
                buffer = twoBefore;
                twoBefore = previous;
                previous = buffer + twoBefore;
            }
        }
    }
}