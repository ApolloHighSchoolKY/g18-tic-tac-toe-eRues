//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];

		for(int row = 0; row < mat.length; row++)
		{
			for(int col = 0; col < mat[row].length; col++)
			{
				if(col%2 == 0)
				{
					mat[row][col] = 'O';
				}
				else
				{
					mat[row][col] = 'X';
				}
			}
		}

	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		char nextChar = ' ';
		int count = 0;

			for(int row = 0; row < mat.length; row++)
			{
				for(int col = 0; col < mat[row].length; col++)
				{
					if(game.charAt(count) == 'X')

					{
						nextChar = 'X';
					}
					else
					{
						nextChar = 'O';
					}
					
					mat[row][col] = nextChar;
					count++;
				}
			}
	}

	public String getWinner()
	{
		//horizontal wins
		if(mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2])
		{
			return "" + mat[0][0] + " wins horizontally"; 
		}
		else if(mat[1][0] == mat[1][1] && mat[1][1] == mat[1][2])
		{
			return "" + mat[1][0] + " wins horizontally"; 
		}
		else if(mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2])
		{
			return "" + mat[0][0] + " wins horizontally"; 
		}
		//vertical wins
		else if(mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0])
		{
			return "" + mat[0][0] + " wins vertically"; 
		}
		else if(mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1])
		{
			return "" + mat[0][1] + " wins vertically"; 
		}
		else if(mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2])
		{
			return "" + mat[0][2] + " wins vertically"; 
		}
		//diagonal wins
		else if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
		{
			return "" + mat[0][0] + " wins diagonally";
		}
		else if(mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2])
		{
			return "" + mat[2][0] + " wins diagonally";
		}
		else
		{
			return "There is a tie!";
		}

	}

	public String toString()
	{
		String output = "";

		for(int row = 0; row < mat.length; row++)
		{
			for(int col = 0; col < mat[row].length; col++)
			{
				output += mat[row][col];
			}
			output += "\n";
		}

		output = output + "\n" + getWinner();

		return output + "\n\n";
	}
}