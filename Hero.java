import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Hero 
{
	public static void main(String [] args)throws IOException
	{
		Scanner input = new Scanner(new File("Hero.dat"));
		int times = input.nextInt();
		for(int i=0; i<times; i++)
		{
			int one = input.nextInt();
			int two = input.nextInt();
			int three = input.nextInt();
			int a = one+two+three;
			int b = two+three-one;
			int c = one+three-two;
			int d = one+two-three;
			int e = a*b*c*d;
			Double sq = Math.sqrt(e);
			Double area = (.25)*(sq);
			out.println((int)Math.floor(area));
			
		}
	}
}
