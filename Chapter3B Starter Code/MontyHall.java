import java.util.Random;

public class MontyHall
{
    public static void main()
    {
        Random gen = new Random();
        int strat1 = 0, strat2 = 0;
        int ansDoor, pickDoor;
        
        //stay strat
        for(int a = 0; a < 1000; a++)
        {
            if(gen.nextInt(3) == gen.nextInt(3))
                strat1++;
        }
        
        //switch strat
        for(int a = 0; a < 1000; a++)
        {
            if(gen.nextInt(3) != gen.nextInt(3))
                strat2++;
        }
        System.out.println();
        System.out.println("Strategy 1: " + strat1 + "\nStrategy 2: " + strat2);
    }
}