import java.util.*;
import java.io.*;

/**
 * Write a description of class scanner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scanner
{
    Scanner scan;
    
    public scanner()
    {
        File file = new File("test.txt");   
        try {
            scan = new Scanner(file);
        }
        catch(FileNotFoundException e) {
            
        }
    }
    
    public void scanfindinline()
    {
        scan.useDelimiter("\\s&\\s");
        //scan.findInLine("@133");
        //String i = scan.next();
        
        String i = scan.next();
        int two = scan.nextInt();
        
        System.out.println(i);
        System.out.println(two);
        System.out.println(i);
    }
}
