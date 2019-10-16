import java.util.Scanner;

public class Fibonacci
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of digits you want to output.");
        int previous = 1, twoBefore = 0, buffer = 0;
        int a = keyboard.nextInt() - 2;
        System.out.print(twoBefore + " ");
        System.out.print(previous + " ");
        for(a = a; a > 0; a--)
        {
            System.out.print(twoBefore + previous + " ");
            buffer = twoBefore;
            twoBefore = previous;
            previous = buffer + twoBefore;
        }
    }
}