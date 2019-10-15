import java.util.Scanner;

public class Fibonacci
{
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of digits you want to output.");
        int previous = 0, current = 1;
        System.out.println("0, ");
        for(int a = keyboard.nextInt() - 2; a > 0; a--)
        {
            System.out.println(current + previous + ", ");
            previous = current;
            current += previous;
        }
        System.out.println(current + previous);
    }
}