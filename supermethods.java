import java.util.*;
import java.io.*;

import static java.lang.System.*;
public class supermethods 
{
	int tie, p1, p2;
	String gamemode;
	public supermethods()
	{
		
	}
	public void game()
	{
		playerselect();
	}
	//playerselect method
	public void playerselect()
	{
		p1 = 0;
		p2 = 0;
		tie = 0;
		gamemode = "";
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
			gamemode = "pvp";
			pvp();
		}
		else if(entered.equals("pvc"))
		{
			pvc();
			gamemode = "pvc";
		}
		else if(entered.equals("cvc"))
		{
			out.println("cvc");
		}
		
	}
	//pvp method
	public void pvc()
	{
		String wp2 = "";
		Scanner input = new Scanner(System.in);
		out.println("Choose a weapon, Player 1- rock paper scissors");
		String wp1 = input.next().toLowerCase();
		out.println();
		Random rand = new Random();
		int num = rand.nextInt(3);
		if(num == 0)
		{
			wp2 = "rock";
			out.println("The computer picked rock");
		}
		if(num == 1)
		{
			wp2 = "paper";
			out.println("The computer picked paper");
		}
		if(num == 2)
		{
			wp2 = "Scissors";
			out.println("The computer picked scissors");
		}
		out.println();
		if(!wp1.equals("rock")&&!wp1.equals("paper")&&!wp1.equals("scissors"))
		{
			do
			{
			out.println("Player 1 choose a real weapon, rock paper scissors");
			wp1 = input.next().toLowerCase();
			}while(!wp1.equals("rock")&&!wp1.equals("paper")&&!wp1.equals("scissors"));
		}
		logic(wp1, wp2);
		
	}
	public void cvc()
	{
		String wp1 = "";
		String wp2 = "";
		Random rand = new Random();
		int num = rand.nextInt(3);
		if(num == 0)
		{
			wp1 = "rock";
			out.println("The computer picked rock");
		}
		if(num == 1)
		{
			wp1 = "paper";
			out.println("The computer picked paper");
		}
		if(num == 2)
		{
			wp1 = "Scissors";
			out.println("The computer picked scissors");
		}
		num = rand.nextInt(3);
		if(num == 0)
		{
			wp2 = "rock";
			out.println("The computer picked rock");
		}
		if(num == 1)
		{
			wp2 = "paper";
			out.println("The computer picked paper");
		}
		if(num == 2)
		{
			wp2 = "Scissors";
			out.println("The computer picked scissors");
		}
		out.println();
		logic(wp1, wp2);
	}
	public void pvp()
	{
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
		logic(wp1, wp2);
	}
	//logic method 
	public void logic(String word1, String word2)
	{
		if(word1.equals("rock"))// rock choice
		{
			if(word2.equals("rock"))//rock rock
			{
				tie++;
				out.println("This is a tie");
				out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
				endGame();
			}
			else if(word2.equals("paper"))// rock paper
			{
				p2++;
				out.println("Player 2 Wins<<Paper beats Rock>>");
				out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
				endGame();
			}
			else if(word2.equals("scissors"))// rock scissors
			{
				p1++;
				out.println("Player 1 Wins<<Rock beats scissors>>");
				out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ ", and "+tie+" ties");
				endGame();
			}
			if(word1.equals("paper"))//paper selected
			{
				if(word2.equals("paper"))//paper paper
				{
					tie++;
					out.println("This is a tie");
					out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
					endGame();
				}
				else if(word2.equals("scissors"))//paper scissors
				{
					p2++;
					out.println("Player 2 Wins<<Scissors beats Paper>>");
					out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
					endGame();
				}
				else if(word2.equals("rock"))//paper rock
				{
					p1++;
					out.println("Player 1 Wins<<Paper beats rock>>");
					out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ ", and "+tie+" ties");
					endGame();
				}
			}
			if(word1.equals("scissors"))//scissors selected
			{
				if(word2.equals("scissors"))//scissors scissors
				{
					tie++;
					out.println("This is a tie");
					out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
					endGame();
					
				}
				else if(word2.equals("rock"))//scissors rock
				{
					p2++;
					out.println("Player 2 Wins<<Rock beats Scissors>>");
					out.println("The score is : Player 1 " +p1+ " Player 2 " +p2+ " and "+tie+" ties");
					endGame();
				}
				else if(word2.equals("paper"))//scissors paper
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
				pvp();
			}
			if(gamemode.equals("pvc"))
			{
				out.println();
				out.println();
				out.println();
				out.println();
				pvc();
			}
			if(gamemode.equals("cvc"))
			{
				out.println();
				out.println();
				out.println();
				out.println();
				cvc();
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
			playerselect();
		}
	}
}
