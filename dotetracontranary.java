import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class dotetracontranary 
{
	public static void main(String [] args)throws IOException
	{
		long startTime = System.currentTimeMillis();
		for(long i = 100000; i<1000000; i++)
		{
			out.println(i);
		}
		long endTime = System.currentTimeMillis();
		out.println("Runtime = "+(endTime - startTime)+ " milliseconds");
	}
}
