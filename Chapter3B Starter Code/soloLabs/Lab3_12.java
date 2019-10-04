package soloLabs;

public class Lab3_12
{
    public static void main()
    {
        System.out.println();
        for(int a = 10; a >= 0; a--)
        {
            for(int b = 0; b < a; b++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        
        for(int a = 1; a <= 10; a++)
        {
            for(int b = 10 - a; b > 0; b--)
                System.out.print(" ");
            for(int b = 0; b < a; b++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        
        for(int a = 1; a <= 10; a++)
        {
            for(int b = 0; b < a; b++)
                System.out.print(" ");
            for(int b = 10 - a; b > 0; b--)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        int buffer;
        for(int a = 1; a <= 10; a++)
        {
            if(a < 5)
                buffer = a;
            else if(a > 5)
                buffer = 11 - a;
            else
                buffer = 5;
                
            for(int b = 5 - buffer; b > 0; b--)
                System.out.print(" ");
            for(int b = 1; b <=  2*buffer - 1; b++)
                System.out.print("*");
            for(int b = 5 - buffer; b > 0; b--)
                System.out.print(" ");
            System.out.println();
        }
    }
}
