package e03;

import java.util.Scanner;

public class AdjacentDuplicates
{
   public static void main(String[] args)
   {
      char num=0;
      System.out.println("Enter numbers one by one and we will tell you if they are the same adjascent");
      Scanner in = new Scanner(System.in);
      char prev=0;
      String input=in.nextLine();
      
      for(int i=0; input.length()>i;i++){
          if(i!=0){
              if(input.charAt(i)==input.charAt(i-1)){
                  System.out.println(input.charAt(i)+" is an adjacent duplicate");
            }
        }}

      // Find and print adjacent duplicates

   }
}
