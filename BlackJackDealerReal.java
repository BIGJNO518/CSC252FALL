import java.util.*;
public class BlackJackDealerReal 

{

	/**This is the BlackJack "Dealer" class, in charge of concurrent deals and tracking 
	 * cards already dealt to handle redundancies. We will use two dimensional arrays for 
	 * cards to be dealt and hold values for cards already dealt.
	 * @param args
	 */
	
	
	private int numCards = 52;//just for a reference
	private String [][] cardsToDeal = new String[2][13];
	private String [][] cardChecker = new String [2][];
	private int [] cardValueGen = new int[11];
	public	String cardSuit = "";
	public	String cardType = "";
	BlackJackGame numPlayers = new BlackJackGame();
	BlackJackDealerReal cardValue = new BlackJackDealerReal();;
	int cardAmount = 1;
	int totalValue = 0;
	int csuit = 0;
	int ctype = 0;
	BlackJackDealerReal setDeck = new BlackJackDealerReal();
	Random randomSuit = new Random();
	Random randomValue = new Random();
	/** This method deals the cards and calls a method which returns a boolean for handling repeat cards
	 * The method does not take in any args. It will be called by the BlackJackGame Class
	 */
	public void  CardDealer()
	{
		
			
									
		for ( int card = 0; card < 1; card++)
		{
			setDeck.SetDeckStub();/* calls ragged two-D array for a card Deck where first row is suit- points (0-3)- which have a corresponding
									string description as the element in that location. The second row will contain the "face values" of
									the 13 different cards in the deck. 
									*/
			csuit = randomSuit.nextInt(4);
			ctype = randomValue.nextInt(13);
			int cV = cardValue.getCardValue(ctype);
			System.out.println (cardsToDeal[csuit][ctype] + "\n" + cV);
			totalValue = totalValue +cV;
			
		}
		
	}	
	public void SetDeckStub()
	{
		cardsToDeal [0][0] = "Hearts";
		cardsToDeal [0][1] = "Clubs";
		cardsToDeal [0][2] = "Diamonds";
		cardsToDeal [0][3] = "Spades";
		cardsToDeal [1][0] = "Ace";
		cardsToDeal [1][1] = "2";
		cardsToDeal [1][2] = "3";
		cardsToDeal [1][3] = "4";
		cardsToDeal [1][4] = "5";
		cardsToDeal [1][5] = "6";
		cardsToDeal [1][6] = "7";
		cardsToDeal [1][7] = "8";
		cardsToDeal[1][8] = "9";
		cardsToDeal [1][9] = "10";
		cardsToDeal [1][10] = "Jack";
		cardsToDeal [1][11] = "Queen";
		cardsToDeal [1][12] = "King";
		
	}	
	public int getCardValue( int t)
	{
		cardValueGen[0] = 15;
		cardValueGen[1] = 1;
		cardValueGen[2] = 2;
		cardValueGen[3] = 3;
		cardValueGen[4] = 4;
		cardValueGen[5] = 5;
		cardValueGen[6] = 6;
		cardValueGen[7] = 7;
		cardValueGen[8] = 8;
		cardValueGen[9] = 9;
		cardValueGen[10] = 10;
		Scanner kbd = new Scanner(System.in);
		int v;
		
		if (t == 0)
		 {
			 System.out.println("You have an ace, what will it be worth. " +
							"Press 1 for a one value or 2 to make it 11");
		 int nc = kbd.nextInt();
		 	
		 if (nc == 1)
		 	{
		 		 v = cardValueGen[1];
		 	}
		 	else
		 	{
		 		 v = cardValueGen[0];
		 	}
		 	
		 }	
		else if (t == 1)
			v = cardValueGen[2];
		else if (t == 2)
			v = cardValueGen[3];
		else if (t == 3)
			v = cardValueGen[4];
		else if (t == 4)
			v = cardValueGen[5];
		else if (t == 5)
			v = cardValueGen[6];
		else if (t == 6)
			v = cardValueGen[7];
		else if (t == 7)
			v = cardValueGen[8];
		else if (t == 8)
			v = cardValueGen[9];
		else 
			v = cardValueGen[10];
		
			
		
	return v;
	}
	
	
	public static void main(String[] args) 
	
	{
		

	}

}

