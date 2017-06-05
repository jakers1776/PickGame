package Games;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber extends Game
{
	public void LetsPlay()
	{
		Random tRNG = new Random();
		int tInput = 0;
		int tPick = tRNG.nextInt( 100 );
		int tDiff = 0;
		Scanner tKeyboard = new Scanner ( System.in );
			
		for( int i = 0; i < 4; i++ )
		{
			System.out.println( "Please guess a number between 1 and 100. I will tell you where you stand." );
			tInput = tKeyboard.nextInt();
			if( tInput > tPick )
			{
				System.out.println( "Lower" );
			}
			else if( tInput < tPick )
			{
				System.out.println( "Higher" );
			}	
			else if( tInput == tPick )
			{
				System.out.println( "You have guessed the number!!!!" );
				System.exit(0);
			}
		}
				
		if( tPick > tInput )
		{
			tDiff = tPick - tInput;
			System.out.println( "This is your last chance. Your last guess was off by " + tDiff + "." );
		}
		else if( tPick < tInput )
		{
			tDiff = tInput - tPick;
			System.out.println( "This is your last chance. Your last guess was off by " + tDiff + "." );
		}

		tInput = tKeyboard.nextInt();
			
		if( tInput == tPick )
		{
			System.out.println( "Good job, you guessed it. :)" );
		}
		else if( tInput != tPick)
		{
			System.out.println( "You still guessed it wrong. :(" );
		}
	}		
}


