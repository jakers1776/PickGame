package Games;

import java.util.Random;
import java.util.Scanner;

public class RPS extends Game
{
	public void LetsPlay()
	{
		String tChoicePlayAgain = "Y" ;
		int tWins = 0;
		int tLosses = 0;
			
		do
		{
			Random tRNG = new Random();
			int tX = tRNG.nextInt( 3 );
			//tX = 0 is scissors; tX = 1 is rock; tX = 2 is paper;
			
			System.out.println( "Please enter ÒSÓ for scissors, ÒRÓ for rock, or ÒPÓ for paper.\n" );
			
			Scanner tKeyboard = new Scanner( System.in );
			String tChoice = tKeyboard.next();
			
			if( tChoice.equals( "S" ) && tX == 0 ) 
			{
				System.out.println( "I picked Scissors!:)\n" );
				System.out.println( "Tie!:|\n" );
				tChoicePlayAgain = "Y";
			}
			else if( tChoice.equals( "R" ) && tX == 0 )
			{
				System.out.println( "I picked Rock!:)\n" );
				System.out.println( "I win!:)\n" );
				tWins += 1;
				System.out.println( "Would you like to play again? (Y/N)\n" );
				tChoicePlayAgain = tKeyboard.next();
			}
			else if( tChoice.equals( "P" ) && tX == 0 )
			{
				System.out.println( "I picked Paper!:)\n" );
				System.out.println( "I lose!:(\n" );
				tLosses += 1;
				System.out.println( "Would you like to play again? (Y/N)\n" );
				tChoicePlayAgain = tKeyboard.next();
			}
			else if( tChoice.equals( "S" ) && tX == 1 ) 
			{
				System.out.println( "I picked Scissors!:)\n" );
				System.out.println( "I lose!:(\n" );
				tLosses += 1;
				System.out.println( "Would you like to play again? (Y/N)\n" );
				tChoicePlayAgain = tKeyboard.next();
			}
			else if( tChoice.equals( "R" ) && tX == 1 )
			{
				System.out.println( "I picked Rock!:)\n" );
				System.out.println( "Tie!:|\n" );
				tChoicePlayAgain = "Y";
			}
			else if( tChoice.equals( "P" ) && tX == 1 )
			{
				System.out.println( "I picked Paper!:)\n" );
				System.out.println( "I win!:)\n" );
				tWins += 1;
				System.out.println( "Would you like to play again? (Y/N)\n" );
				tChoicePlayAgain = tKeyboard.next();
			}
			else if( tChoice.equals( "S" ) && tX == 2) 
			{
				System.out.println( "I picked Scissors!:)\n" );
				System.out.println( "I win!:)\n" );
				tWins += 1;
				System.out.println( "Would you like to play again? (Y/N)\n" );
				tChoicePlayAgain = tKeyboard.next();
			}
			else if( tChoice.equals( "R" ) && tX == 2)
			{
				System.out.println( "I picked Rock!:)\n" );
				System.out.println( "I lose!:(\n" );
				tLosses += 1;
				System.out.println( "Would you like to play again? (Y/N)\n" );
				tChoicePlayAgain = tKeyboard.next();
			}
			else if( tChoice.equals( "P" ) && tX == 2)
			{
				System.out.println( "I picked Paper!:)\n" );
				System.out.println( "Tie!:|\n" );
				tChoicePlayAgain = "Y";
			}
			else
			{
				System.out.println( "You did not pick one of the three choices given. Remember to capitalize the letter.\n" );
			}
			
		}while( tChoicePlayAgain.equals( "Y" ) );
			
			System.out.println( "You won " 
								+ tWins + 
								" game(s), you lost " 
								+ tLosses + 
								" games(s).\n" );
	}
}
