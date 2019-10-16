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
            for(int b = 0; b < size - a; b++)
                System.out.print(" ");
            for(int b = 0; b < a; b++)
            {    
                System.out.print(nextNum);
                nextNum += b + (size + 1) - a;
                if(nextNum > 9)
                    nextNum = (nextNum%10) + (nextNum/10);
            }
            System.out.println();
            seed += (size+2) - a;
            if(seed > 9)
                    seed = (seed%10) + (seed/10);
        }
    }
}