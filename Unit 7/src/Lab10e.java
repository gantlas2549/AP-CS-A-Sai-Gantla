//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String again;
		do {
			System.out.print("Choose an upper bound :: ");
			int response = keyboard.nextInt();
			GuessingGame test = new GuessingGame(response);
			test.playGame();
			System.out.println("\nDo you want to play again (enter 'y')?");
			again = keyboard.next();
		}while(again.equals("y"));
	}
}