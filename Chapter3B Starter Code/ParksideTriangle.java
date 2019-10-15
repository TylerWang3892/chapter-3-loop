import java.util.Scanner;

public class ParksideTriangle
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the size then followed by the seed");
        
        int size = keyboard.nextInt();
        int seed = keyboard.nextInt();
        
        int nextNum;
        
        for(int a = size; a > 0; a--)
        {
            nextNum = seed;
            for(int b = 0; b < a; b++)
            {    
                System.out.print(nextNum + " ");
                nextNum += b + 1;
                if(nextNum > 9)
                    nextNum = (nextNum%10) + 1;
            }
            System.out.println();
            seed += (a+2) - seed;
        }
    }
}