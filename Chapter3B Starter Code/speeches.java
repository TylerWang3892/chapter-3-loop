import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;

import java.io.*;   

public class speeches
{
    public static void main() throws IOException
    {

        File file = new File("speeches/tjefferson.txt");
        //File file = new File("speeches/taft.txt");
        //File file =  new File("speeches/state of the union 2011.txt");
        //File file = new File("speeches/jadams inaugural speech.txt");
        //File file = new File("speeches/gwbush.txt");
        //File file = new File("sppeches/fillmore.txt");
        
        Scanner scanFile = new Scanner(new File("speeches\\people.txt"));
        Scanner iterator = new Scanner(file);
        for(int a = 0; a < 4; a++)
            iterator.nextLine();
        while(iterator.hasNext())
        {
            
        }


    }
}