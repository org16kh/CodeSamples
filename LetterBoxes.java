//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxes
{
	//instance variables and constructors could be present, but are not necessary
	
	public static void printBox(char letter, int size)
	{
		for(int i = 0; i<size; i++)
		{
			for(int k =0; k<size; k++)
			{
				out.print(letter);
			}
			out.println();
		}
	}
}