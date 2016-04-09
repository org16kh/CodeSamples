import java.util.*;
import java.io.*;
import static java.lang.System.*;
public class Order 
{
	public static void main(String [] args)throws IOException
	{
		Scanner input = new Scanner(new File("Order.dat"));
		int times = input.nextInt();
		for(int i=0; i<times;i++)
		{
			String fun = input.next();
			String Last = input.next();
			String First = input.next();
			out.println(First);
		}
	}
}
