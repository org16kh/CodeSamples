//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxesRunner
{
	public static void main( String args[] )
	{		
		Scanner input = new Scanner(System.in);
		char choice = ' ';
		do
		{
			out.print("\nEnter the letter for the box :: ");
			char letter = input.next().charAt(0);
			out.print("Enter the size of the box ::");
			int size = input.nextInt();
			LetterBoxes.printBox(letter, size);
			out.print("\nDo you want to enter more sample input?");
			choice = input.next().charAt(0);
		}while(choice == 'y'|| choice == 'Y');
	}
}