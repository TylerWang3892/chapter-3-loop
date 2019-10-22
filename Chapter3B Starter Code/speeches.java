/***********************************************************
 * Title: speeches.java     Date: 2019/10/20
 * 
 * Author: Tyler Wang
 * 
 * Description: Analizes speeches from 3 different time 
 *  periodsfor word length, word count, and the occurence 
 *  of different words.
 ***********************************************************/

import java.util.Scanner;
import java.io.*;   

public class speeches
{
    public static void main() throws IOException
    {
        
        //creation of the file objects
        
        //File file = new File("speeches/tjefferson.txt");
        //File file = new File("speeches/taft.txt");
        //File file =  new File("speeches/obama_inaugural_speach.txt");
        //File file = new File("speeches/Jadams inaugural speech.txt");
        //File file = new File("speeches/gwbush.txt");
        File file = new File("speeches/fillmore.txt");
        
        Scanner iterator = new Scanner(file);
        
        int numOfWord = 0, sumOfLength = 0, goverment = 0, 
            our = 0, united = 0, people = 0, democracy = 0; 
        
        String name = iterator.nextLine(), date = iterator.nextLine(), 
            stringBuffer;
        
        for(int a = 0; a < 2; a++)
            iterator.nextLine();
            
       //iterating through the selected file
       while(iterator.hasNext())
        {
            numOfWord++;
            
            stringBuffer = iterator.next().toLowerCase();;
            sumOfLength += stringBuffer.length();
            
            if(stringBuffer.equals("goverment"))
                goverment++;
            if(stringBuffer.equals("our"))
                our++;
            if(stringBuffer.equals("united"))
                united++;
            if(stringBuffer.equals("democracy"))
                democracy++;
        }
        
        //printing the output
        System.out.println(name + "\n" + date + "\n\n" + 
                    "Number of words: " + numOfWord + 
                    "\tAverage length of words: " + sumOfLength/numOfWord
                    + "\nNumber of times said goverment: " + goverment
                    + "\nNumber of times said our: " + our
                    + "\nNumber of times said united: " + united + 
                     "\nNumber of times said democracy: " + democracy);
    }
}