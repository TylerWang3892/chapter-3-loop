import TurtleGraphics.*;

public class Spiral
{
    public static void main()
    {
        StandardPen draw = new StandardPen();
        
        draw.move(10);
        draw.turn(90);
        
        for(int a = 10; a <= 500; a += 10)
        {
            draw.move(a);
            draw.turn(90);
        }
    }
}