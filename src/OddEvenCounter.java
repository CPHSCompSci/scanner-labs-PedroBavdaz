//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
	   setLine("");
   }

   public OddEvenCounter(String s)
   {
	   setLine(s);
   }

	public void setLine(String s)
	{
		this.line = s;
	}

	public int getEvenCount()
	{
	int count=0;	
		
		Scanner karrl = new Scanner (line);
		
		while(karrl.hasNextInt())
		{
			int numb = karrl.nextInt();
			if (numb%2!= 0) {
				count++;
			}
			
		}
		
		return count;
	}

	public int getOddCount()
	{
		int count=0;	
		
		Scanner karrl = new Scanner (line);
		
		while(karrl.hasNextInt())
		{
			int numb = karrl.nextInt();
			if (numb%2== 0) {
				count++;
			}
			
		}
		
		return count;
	}

	public String toStringOdd( )
	{
		return "Odd count: "+getOddCount();
	}
	public String toStringEven( )
	{
		return "Even count: "+getEvenCount();
	}
	public String getLine()
	{
		return line;
	}
}