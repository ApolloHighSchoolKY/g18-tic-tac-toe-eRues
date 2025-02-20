//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		int looper = file.nextInt();
		
		for(int i = 0; i < looper; i++)
		{
			TicTacToe game = new TicTacToe(file.next());
			System.out.println(game);
		}


		file.close();




	}
}



