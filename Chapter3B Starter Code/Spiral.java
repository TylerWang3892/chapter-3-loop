/***********************************************
 * Title: Spiral.java   Date: 2019/10/20
 * 
 * Author: Tyler Wang
 * 
 * Description: Draws out a spiral using the
 *  turtlegraphics class.
 ***********************************************/
import TurtleGraphics.*;

public class Spiral
{
    public static void main()
    {
        StandardPen draw = new StandardPen();
        
        //starting the  first leg of the spiral
        draw.move(10);
        draw.turn(90);
        
        //finishing 50 legs fo the spiral
        for(int a = 10; a <= 500; a += 10)
        {
            draw.move(a);
            draw.turn(90);
        }
    }
}