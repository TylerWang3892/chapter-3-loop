package e03;

import java.util.Scanner;

public class NumberEvenOddInputs
{
   public static void main(String[] args)
   {
      int numOdd = 0;
      int numEven = 0;
      int num = 0;
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a series of numbers, then type Q to process: ");

      // Loop on input and check oddness or evenness
      while(in.hasNextInt())
      {
          num = in.nextInt();
          if(num % 2 == 0)
            numEven++;
          else
            numOdd++;
      }
      //Display Output
      System.out.println("Total of odd numbers: " + numOdd + "\tTotal of odd numbers: " + numEven);  
   }
}
