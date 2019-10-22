import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.*;  
public class OddEvenCounterRunner
{
   public static void main(String args[]) throws FileNotFoundException
   {
	   Scanner scan = new Scanner(new File("OELine.txt"));
	   while(scan.hasNextLine())
		{
		   String line = scan.nextLine();
		   OddEvenCounter LC = new OddEvenCounter(line);
		   System.out.println(LC.getLine());
		   System.out.println("");
		   System.out.println(LC.toStringEven());
		   System.out.println("");
		   System.out.println(LC.toStringOdd());
		   System.out.println("");

		   
		}
	}
}