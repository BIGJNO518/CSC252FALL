import java.util.*;



public class BlackJackGame 
{
	/**Jason P Nowak
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		BlackJackPlayer playerAmount = new BlackJackPlayer();
		BlackJackGame startTheGame = new BlackJackGame ();
		Scanner kbd = new Scanner(System.in);
		
		System.out.println ("How many players? ");
		int numPlayers = kbd.nextInt();
		
		playerAmount.setAmount(numPlayers);
		playerAmount.getAmount();
		int pa = playerAmount.getAmount();
		playerAmount.writeOutput(pa);
		startTheGame.startGame(pa);
	
	}	
	public  void startGame(int nP)
	{	
		int resetPNum = 1;
		BlackJackDealerReal getD = new BlackJackDealerReal();
		
		for ( int pNum = (nP - (nP-1)) ; pNum <= nP; pNum++)// for each player we will call the dealer in this for loop
		{	
			System.out.println ("Player " + (pNum) + "\n");
			
			for( int round = 1; round <= 2; round ++) //deals the first two cards to each player
			{
				getD.CardDealer();
			}
		}
		System.out.println("Nice Cards!!");
		
		
		while ( resetPNum == 1 )
		{
			Scanner kbd = new Scanner(System.in);
			System.out.println("Would you like to hit or stay. Press 1 to hit, 2 to stay ");
			int pc = kbd.nextInt();
			if (pc == 1)
			{
			getD.CardDealer();	
			}
		}
	}
	
	public int  storePlayerAmount(int pas)
	{
	 int pa = pas;
	 return pa;
	}
	
		
	}
	

