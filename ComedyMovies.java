import java.util.*;


/** This class is a descendant of the Movies class. It will call constructors of the base class using SUPER
 * It will also have override constructors for some parameters and an override writeOutput method
 * @author JasonNowak
 *
 */

public class ComedyMovies extends Movies 
{
	
	
	String [] cT = new String[1];
	Movies cm1 = new ComedyMovies();
	
	
	public static void main (String[]args)
	{
		
		Scanner kbd = new Scanner(System.in);
	
	
	}	
	
	public void stackComMovieInfo()
	{
		cm1.setTitle("The Wedding Singer");
		cm1.getTitle();
		cm1.setDirector("Frank Coraci");
		cm1.getDirector();
		
		
		
	}
	public String getCT()
	{
		cT[0] = "The Wedding Singer";
		return cT[0];
	}
	public  ComedyMovies(String comedyTitle) 
	{
		super(comedyTitle);
	
		
	}
	public ComedyMovies() 
	{
		super();
	}
	

	
}
