import java.util.*;


public class Movies 
{

	private String title = "";
	private String [] director = new String[5];
	private String [] actors = new String [5];
	private int rating = 0;
	private int year = 0;
	private double cost = 0.0;
	
	
	public Movies ()
	{
		title = "no title yet";
	}
	public  Movies(String initialTitle)
	{
		title = initialTitle;
	}
	public void setTitle(String titleName)
	{
		this.title = titleName;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setDirector(String d1)
	{
		for (int i = 0; i< 1; i++)
			this.director[i] = d1;
		
	}
	public void setDirector(String d1, String d2)
	{
		for (int i = 0; i< 1; i++)
			this.director[i] = d1;
		for (int i = 1; i< 2; i++)
			this.director[i] = d2;
		
	}
	public String[] getDirector()
	{
		return director;
	}
	
	public void setActors (String [] a)
	{
		for (int i = 0; i < actors.length; i++)
		{
			actors[i] = a[i];
		}
		
	}
	
	public String[] getActors()
	{
		return actors;
	}
	public void setRating (int r)
	{
		this.rating = r;
	}
	
	public int getRating()
	{
		return rating;
	}
	public void setYear(int y)
	{
		this.year = y;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setCost(double c)
	{
		this.cost = c;
	}
	
	public double getCost ()
	{
		return cost;
	}
	
	public void writeOutput ()

	{
		getTitle();
		getDirector();
		getActors();
		getRating();
		getYear();
		getCost();
		System.out.println ("You chose the movie " + this.title + "This movie stars: ");
		for (int i = 0; i <= actors.length; i++)
		{
			System.out.print(actors[i] + "  ");
		}
		System.out.println ("This movie was directed by:");
		for (int i = 0; i <= director.length; i++)
		{
			System.out.print(director[i] + "  ");
		}
		System.out.println ("The movie was made in " + year + " and cost $" + cost + " to make." );
		System.out.println ("The movie received a " + rating + " star rating online.");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner kbd = new Scanner(System.in);
		System.out.println ("What movie would you like to know more about? ");
		String movie = kbd.nextLine();
		
		

	}

}
