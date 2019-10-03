package e03;

import java.util.Scanner;

public class LargestInput
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      
      System.out.print("Enter a series of numbers, then type Q to process: ");
      
      int largest  = in.nextInt();
      int smallest = largest;
      int num=0,av=0,time=0;
      
      smallest = Integer.MAX_VALUE;
      
      while(in.hasNextInt()){
          num=in.nextInt();
          if(num>largest){
              largest=num;}
          if(num<smallest){
              smallest=num;}
          av+=num;
          time++;
        }
      // Loop on input and check for a new min or max

      // Output the results
      System.out.println("Largest: " + largest + "\n" + "Smallest: " + smallest +
        "\nAverage: "+ ((double)av/time));
      System.out.println("Range: "+(largest-smallest));
   }
}
