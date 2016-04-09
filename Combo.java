import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Combo 
{
	public static void main(String [] args)throws IOException
	{
		Scanner input = new Scanner(new File("Combo.dat"));
		int times = input.nextInt();
		for(int i=0; i<times; i++)
		{
			double cOne = input.nextDouble()/40;
			double cTwo = input.nextDouble()/40;
			double cThree = input.nextDouble()/40;
			double pOne = Math.floor(cOne*100);
			double ptwo = Math.floor(cTwo*100);
			double pThree = Math.floor(cThree*100);
			out.println((int)pOne+"% "+(int)ptwo+"% "+(int)pThree+"%");
			
		}
	}
}