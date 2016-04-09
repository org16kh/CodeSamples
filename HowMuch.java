import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class HowMuch
{
	public static void main(String [] args)throws IOException
	{
		Scanner input = new Scanner(new File("HowMuch.dat"));
		int times = input.nextInt();
		for(int i=0; i<times; i++)
		{
			int speed = input.nextInt();
			int time = input.nextInt();
			int distance = input.nextInt();
			int toGo = distance-(speed*time);
			if(toGo == 0)
			{
				out.println("YOU'RE THERE!");
			}
			else if(toGo >0)
			{
				out.println(toGo +" miles to go!");
			}
			else
			{
				out.println("WHOOPS! TURN AROUND!");
			}
		}
	}
}