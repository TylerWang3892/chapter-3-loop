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
        for(int a = size; a >= 1; a--)
        {
            nextNum = seed;
            for(int b = a; a >= b; b++)
            {
                System.out.print(nextNum);
                nextNum += ((b+1) - nextNum);
            }
        }
    }
}