
import java.util.*;



public class BlackJackPlayer 
{
 
	/**Jason P. Nowak 
	 * CSC 252
	 * This class will set and get names and amount of players for a BlackJack game. 
	 * 
	 */
	
	private String playerName = "";
	private int playerAmount = 1;
	
	
	public static void main(String[] args) 
	{
		

	}

	
	public void setAmount(int numP)
	{
		
		this.playerAmount = numP + this.playerAmount;
		
	}
	
	public  int getAmount()
	{
		return playerAmount;
	}
	public void writeOutput(int numP)
	{
		System.out.println("There are " + numP + " players including the dealer.");
	}
}