import java.util.*;
import java.io.*;

import static java.lang.System.*;
public class logic
{

String word1, word2;
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