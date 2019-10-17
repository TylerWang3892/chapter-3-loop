import java.util.Scanner;

public class Fibonacci
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of digits you want to output.");
        int previous = 1, twoBefore = 0, buffer = 0;
        int numofNumbers = keyboard.nextInt();
        for(int a = 0; numofNumbers > a; a++)
        {
            if(a ==0)
                System.out.print(twoBefore + " ");

            else if(a == 1)
                System.out.print(previous + " ");
            else
            {
                System.out.print(twoBefore + previous + " ");
                buffer = twoBefore;
                twoBefore = previous;
                previous = buffer + twoBefore;
            }
        }
    }
}