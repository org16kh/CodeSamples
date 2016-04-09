import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Welcome 
{
	public static void main(String [] args)throws IOException
	{
		Scanner input = new Scanner(new File("Welcome.dat"));
		int times = input.nextInt();
		for(int i=0; i<times; i++)
		{
			int times2 = input.nextInt();
			for(int j=0; j<times2;j++)
			{
				out.println("Trick or treat!!");
			}
			out.println();
		}
	}
}
