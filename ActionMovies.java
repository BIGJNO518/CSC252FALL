
public class ActionMovies extends Movies
{

	
	
	Movies [] am1 = new ActionMovies[6];
	Movies actionTitle = new ActionMovies();

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		ActionMovies wo = new ActionMovies();
		wo.stackAM1();
		wo.writeOutput();
		
		
		
		
		
		
		
		
	}
	public void stackAM1()
	{
		am1[0] = actionTitle("Die Hard");
		am1[1] = actionTitle(28000000.00);
		am1[2] = actionTitle ("Bruce Willis  ", "Bonnie Bedelia  ", "Reginald VelJohnson  ", "Alan Rickman  ", "William Atherton  ");
		am1[3] = actionTitle (1988);
		am1[4] = actionTitle ("8.2 Stars");
		am1[5] = actionTitle ("John McTiernan");
	}
	public void writeOutput()
	{
		System.out.println ("You have chosen the action movie " + am1[0] + ". This action movie was made in " + am1[3] +
							". The action movie was directed by " + am1[5] + ". The movie would spur a long career for " + am1[5] + ".");
		System.out.println ("This action movie features lead actors" + am1[2] + ".");
		System.out.println ("The movie cost a whopping $" + am1[1] + " to make.");
		System.out.println ("On rottentomatos.com the movie receives " + am1[4] + ".");
	}

	private  static Movies actionTitle(String string, String string2, String string3, String string4, String string5) 
	{
		
		return null;
	}
	private static Movies actionTitle( int i)
	{
		return null;
	}


	private static Movies actionTitle(double d) 
	{
		
		return null;
	}



	private static Movies actionTitle(String string)
	{
		
		return null;
	}

}
