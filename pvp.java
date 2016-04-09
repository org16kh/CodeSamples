import java.util.*;
import java.io.*;

import static java.lang.System.*;
public class pvp 
{
	int tie, p1, p2;
	String gamemode;
	public pvp()
	{
	} 
	public void pvp()
	{
		pvp2();
	}
	public void pvp2()
	{
		p1 = 0;
		p2 = 0;
		tie = 0;
		gamemode = "";
		Scanner input = new Scanner(System.in);
		out.println("Choose a weapon, Player 1- rock paper scissors");
		String wp1 = input.next().toLowerCase();
		out.println();
		out.println("Choose a weapon, Player 2- rock paper scissors");
		String wp2 = input.next().toLowerCase();
		out.println();
		if(!wp1.equals("rock")&&!wp1.equals("paper")&&!wp1.equals("scissors"))
		{
			do
			{
			out.println("Player 1 choose a real weapon, rock paper scissors");
			wp1 = input.next().toLowerCase();
			}while(!wp1.equals("rock")&&!wp1.equals("paper")&&!wp1.equals("scissors"));
		}
		if(!wp2.equals("rock")&&!wp2.equals("paper")&&!wp2.equals("scissors"))
		{
			do
			{
			out.println("Player 2 choose a real weapon, rock paper scissors");
			wp2 = input.next().toLowerCase();
			}while(!wp2.equals("rock")&&!wp2.equals("paper")&&!wp2.equals("scissors"));
		}
		if(wp1.equals("rock"))// rock choice
		{
			if(wp2.equals("rock"))//rock rock
			{
				tie++;
				out.println("This is a tie");
				out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
				endGame();
			}
			else if(wp2.equals("paper"))// rock paper
			{
				p2++;
				out.println("Player 2 Wins<<Paper beats Rock>>");
				out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
				endGame();
			}
			else if(wp2.equals("scissors"))// rock scissors
			{
				p1++;
				out.println("Player 1 Wins<<Rock beats scissors>>");
				out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ ", and "+tie+" ties");
				endGame();
			}
			if(wp1.equals("paper"))//paper selected
			{
				if(wp2.equals("paper"))//paper paper
				{
					tie++;
					out.println("This is a tie");
					out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
					endGame();
				}
				else if(wp2.equals("scissors"))//paper scissors
				{
					p2++;
					out.println("Player 2 Wins<<Scissors beats Paper>>");
					out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
					endGame();
				}
				else if(wp2.equals("rock"))//paper rock
				{
					p1++;
					out.println("Player 1 Wins<<Paper beats rock>>");
					out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ ", and "+tie+" ties");
					endGame();
				}
			}
			if(wp1.equals("scissors"))//scissors selected
			{
				if(wp2.equals("scissors"))//scissors scissors
				{
					tie++;
					out.println("This is a tie");
					out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
					endGame();
					
				}
				else if(wp2.equals("rock"))//scissors rock
				{
					p2++;
					out.println("Player 2 Wins<<Rock beats Scissors>>");
					out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
					endGame();
				}
				else if(wp2.equals("paper"))//scissors paper
				{
					p1++;
					out.println("Player 1 Wins<<Scissors beats Paper>>");
					out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ ", and "+tie+" ties");
					endGame();
				}
			}
		}
	}
	public void endGame()
	{
		out.println("Would you like to play again?(Yes/No/Change gamemode - change)");
		Scanner input = new Scanner(System.in);
		String answer = input.next().toLowerCase();
		if(answer.equals("yes"))
		{
			if(gamemode.equals("pvp"))
			{
				out.println();
				out.println();
				out.println();
				out.println();
				pvp2();
			}
		}
		if(answer.equals("No"))
		{
			out.println();
			out.println("Thanks for playing!");
		}
		if(answer.equals("change"))
		{
			out.println();
			out.println();
			out.println();
			out.println();
			playerselect ps = new playerselect();
			ps.playerselect();
		}
	}
}
