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
		String winType = " ";
		String winner = " ";

		if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2] || mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0])
		{
			winType = "Diagonaly";
			if(mat[0][0] == 'X' || mat[2][0] == 'X')
			{
				winner = "X ";
			}
			else
			{
				winner = "O ";
			}
		}

		for(int row = 0; row < mat.length; row++)
		{
			if(mat[row][0] == mat[row][1] && mat[row][1] == mat[row][2])
			{
				winType = "Horizontaly";

				if(mat[row][0] == 'X')
				{
					winner = "X ";
				}
				else
				{
					winner = "O ";
				}
			}
		}

		for(int col = 0; col < mat[0].length; col++)
		{
			if(mat[0][col] == mat[1][col] && mat[1][col] == mat[1][col])
			{
				winType = "Verticaly";

				if(mat[0][col] == 'X')
				{
					winner = "X ";
				}
				else if(mat[0][col] == 'O')
				{
					winner = "O ";
				}
				else
				{
					return "Cat!";
				}
			}
		}

		return "" + winner + "won " + winType;
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