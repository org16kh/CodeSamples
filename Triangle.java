import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Triangle 
{
	public static void main(String [] args)throws IOException
	{
		Scanner input = new Scanner(new File("Triangle.dat"));
		int times = input.nextInt();
		for(int i=0; i<times; i++)
		{
			int num = input.nextInt();
			int sum = 0;
			switch(num)
			{
			case 15: sum +=5;
			case 10: sum +=4;
			case 6: sum +=3;
			case 3: sum +=1;
			case 1: sum +=1;
			default: sum+=0;
			}
			if(sum>0)
			{
				out.println("TRIANGULAR");
			}
			else
			{
				out.println("NOT TRIANGULAR");
			}
		}
	}
}