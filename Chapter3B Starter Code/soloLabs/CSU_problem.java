package soloLabs;

import java.util.Scanner;

public class CSU_problem
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("enter an integer.");
        int number = keyboard.nextInt();
        int count = 0;
        int nextLine = 0;
        while(number != 1)
            if(number % 2 == 0)
            {
                number /= 2;
                if(nextLine > 50)
                {
                    System.out.println();
                    nextLine = 0;
                }
                System.out.print(number + " ");
                nextLine += 1 + numDig(number);
                count++;
            }
            else
            {
                number = number * 3 + 1;
                if(nextLine > 50)
                {
                    System.out.println();
                    nextLine = 0;
                }
                System.out.print(number +  " ");
                nextLine += 1 + numDig(number);
                count++;
            }
        System.out.println("\n");
            
        System.out.println("There are: " + count + " members in the set");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    static int numDig(int a_number)
    {
        int number = a_number;
        int numofDig = 0;
        while(number != 0)
        {
            number /= 10;
            numofDig++;
        }
        return numofDig;
    }
}
