package pickTheGame;

import java.util.Scanner;
import Games.Game;

class DoWhatYouWannaDo 
{
	public static void main( String[] args ) 
	{
		String tChoice;
		
		Game[] tGames = new Game[10];
		tGames[0] = Game.NewGame("RPS");
		tGames[1] = Game.NewGame("GuessTheNumber");
		
		do 
		{
			System.out.println( "===========================================" );
			System.out.println( "Please pick an option from the list below:" );
			System.out.println( "===========================================" );
			System.out.println( "1.) Play: Rock, Paper, Scissors" );
			System.out.println( "2.) Play: Guess the Number" );
			System.out.println( "3.) Quit" );          
			System.out.println( "===========================================" );
			Scanner keyboard = new Scanner( System.in );
			tChoice = keyboard.nextLine();

			if( tChoice.equals( "1" ) )
			{
				tGames[0].LetsPlay();
			}
			else if( tChoice.equals( "2" ) )
			{
				tGames[1].LetsPlay();
			}
			else if( !tChoice.equals( "1" ) && !tChoice.equals( "2" ) && !tChoice.equals( "3" ) )
			{
				System.out.println( "That isn't an option on the menu." );
			}
		}while( !tChoice.equals( "3" ) );
	}
}
