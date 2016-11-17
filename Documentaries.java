import java.util.Scanner;

public class Documentaries extends Movies
{
	String [] dT = new String[1];
	ComedyMovies dm1 = new ComedyMovies();
	
	int year;
	public static void main (String[]args)
	{
		
		Scanner kbd = new Scanner(System.in);
	
	
	}	
	
	public void stackDocMovieInfo()
	{	Movies [] titles = new Movies[5];
		dm1.setTitle("Tricked: The Documentary");
		dm1.getTitle();
		dm1.setDirector("John Keith Wasson", "Jane Wells");
		dm1.getDirector();
		titles[0] = new Documentaries ("Lovely Lace");
		titles[1] = new Documentaries (1984);
		titles[2] = new Documentaries ("Janey Boggs", "Steve McKirk", "Sug");
	}
	public String getDT() //from here these are just constructors in order for me to load the titles array of type Movies with types of objects from
	{						// the type Documentaries. 
		dT[0] = "";
		return dT[0];
	}
	public  Documentaries(String comedyTitle) 
	{
		super(comedyTitle);
	
		
	}
	public Documentaries() 
	{
		super();
	}

	public  Documentaries(int i) 
	{
		year = 0;
		
		
	}
	public Documentaries(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public int getY()
	{
		year = getYear();
		return year;
	}



}
