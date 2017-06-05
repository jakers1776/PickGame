package Games;

public abstract class Game 
{
	public void LetsPlay(){}
	
	public static Game NewGame( String tType )
	{
		if( tType.equals( "RPS" ) )
		{
			return new RPS();
		}
		else if( tType.equals( "GuessTheNumber" ) )
		{
			return new GuessTheNumber();
		}
		return null;
	}
}
