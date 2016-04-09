import java.util.*;
import java.io.*;

import static java.lang.System.*;
public class playerselect 
{
	public playerselect()
	{
		
	}
	public void playerselect()
	{
		Scanner input = new Scanner(System.in);
		out.println("Choose a gamemode:");
		out.println("For Player vs Computer, enter pvc");
		out.println("For Player vs Player, enter pvp");
		out.println("For Computer vs Computer, enter cvc");
		out.print("Enter what gamemode you want to play : ");
		String entered = input.next();
		entered = entered.toLowerCase();
		out.println();
		if(!entered.equals("pvp")&&!entered.equals("pvc")&&!entered.equals("cvc"))
		{
			do
			{
				out.println("Select a real gamemode:");
				out.println("For Player vs Computer, enter pvc");
				out.println("For Player vs Player, enter pvp");
				out.println("For Computer vs Computer, enter cvc");
				out.print("Enter what gamemode you want to play : ");
				entered = input.next();
				entered = entered.toLowerCase();
				out.println();
			}while(!entered.equals("pvp")&&!entered.equals("pvc")&&!entered.equals("cvc"));
		}
		if(entered.equals("pvp"))
		{
			pvp pvp = new pvp();
			pvp.pvp();
		}
		else if(entered.equals("pvc"))
		{
			
		}
		else if(entered.equals("cvc"))
		{
			out.println("cvc");
		}
	}
}
