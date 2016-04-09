import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class stroudship2 
{
	public static void main(String [] args)throws IOException
	{
		Scanner input = new Scanner(new File("stroudship2.in"));
		int times = input.nextInt();
		ArrayList<String> names = new ArrayList();
		ArrayList<String> toPrint = new ArrayList();
		input.nextLine();
		while(input.hasNext())
		{
			names.add(input.nextLine());
		}
		if(names.size()<= times*2)
		{
			for(int i = 0; i<names.size(); i++)
			{
				toPrint.add(names.get(i));
			}
		}
		else
		{
			for(int i = 0; i<times;i++)
			{
				toPrint.add(names.get(i));
				//out.println(names.get(i));
			}
			int k = names.size();
			int n = times;
			for(int i = 0; i<times; i++)
			{
				toPrint.add(names.get(k-n));
				n--;
				
			}
		}
		print(toPrint);
	}
	public static void print(ArrayList b)
	{
		out.println("The people who will be processed today are");
		for(int i = 0; i<b.size(); i++)
		{
			out.println(b.get(i));
		}
		out.println("Come back tomorrow!");
	}
}
