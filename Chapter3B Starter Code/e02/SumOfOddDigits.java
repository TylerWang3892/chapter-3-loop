
package e02;

import java.util.Scanner;

public class SumOfOddDigits
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int number = 0, sum = 0;
      // Get the input
      System.out.println("Enter a bunch of numbers with space between each.");
      in.useDelimiter(",");
      do
      {
          number = in.nextInt();
          System.out.println(number);
          if(number % 2 == 1)
              sum += number;
          
      }while(in.hasNext());
      // The sum of odd digits of the input

         // Only add digit if it is odd


      // Output the result
      System.out.println(sum);
   }
}
