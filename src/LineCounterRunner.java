import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.*;  
public class LineCounterRunner
{
   public static void main( String args[] ) throws FileNotFoundException
   {	
	   Scanner scan = new Scanner(new File("LineCounter.txt"));
	   while(scan.hasNextLine())
		{
		   String line = scan.nextLine();
		   LineCounter LC = new LineCounter(line);
		   System.out.println(LC.getLine());
		   System.out.println("");
		   System.out.println(LC.toString());
		   System.out.println("");

		   
		}
	}
}