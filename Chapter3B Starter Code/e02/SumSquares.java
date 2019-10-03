package e02;

public class SumSquares
{
   public static void main(String[] args)
   {
      int sum = 0;
      // The sum of all squares between 1 and 100
      System.out.println("Number \t total");
      for(int a = 0; a <=20; a++)
      {  
          sum += Math.pow(a, 2);
          System.out.printf("Square of %4.2f \t %4.2f \n", Math.pow(a , 2), sum);
      }  
      // Output the result
      System.out.printf("\t %4.2f", sum);
   }
}
