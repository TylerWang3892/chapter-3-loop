/*************************************************
 * Title: FourLeafRose.java     Date: 2019/10/20\
 * 
 * Author: Tyler Wang
 * 
 * Desciption: Draws a four leaf rose.
 */
import TurtleGraphics.StandardPen;
import java.lang.Math;
import java.awt.*;
public class FourLeafRose
{
    public static void main()
    {
        StandardPen draw = new StandardPen();
        
        //moves pen inplace
        draw.setColor(Color.WHITE);
        draw.move(100, 0);
        
        //prints out from 0 to 2PI in 100 steps
        draw.setColor(Color.BLACK);
        for(int a = 1; a < 100; a++)
            draw.move(Math.cos((a*3.6*Math.PI)/180) * Math.cos(2 * (a*3.6*Math.PI)/180) *100,
                Math.sin((a*3.6*Math.PI)/180) * Math.cos(2 * (a*3.6*Math.PI)/180)*100);
    }
}