import java.util.*;
import javax.swing.*;

public class BlackJackDealer
{
	public static void main (String[]args)
	{
	int playerNumber = 1;
	int cardAmount = 2;
	Scanner keyboard = new Scanner(System.in);
	
	
	if ((playerNumber % 2) != 0)
	
	for (int report; cardAmount > 0; cardAmount--)
     {
        
           int cardSuit = calcCardSuit();
           int cardNumber = calcCardNumber();
           String cardDescrip = showCardDescrip(cardNumber, cardSuit);
           int cardValue = cardValueGen(cardNumber);
           System.out.printf ("-%16s%3s%2\n",cardDescrip," ", cardValue);
           
     
     
     
     } 
	  
			
}//end of main method for BlackJack Class.
			
  /** This method will return a randomly generated number equal to a card suit
  for each card.
  @return Returns the card suit value to main
  */
  
  public static int calcCardSuit()
  {
     Random num = new Random();
     
     int suit;
     suit = num.nextInt(4)+1;
     return suit;
  
  }//end calcCardSuit method    
  
  /**This method will generate a random card number for each card
  @return Returns card number to main
  */
  
  public static int calcCardNumber()
  {
     Random num = new Random();
     
     int cardNum;
     cardNum = num.nextInt(13)+1;
     return cardNum;
     
  }//end calcCardNumber method
  
  /** This method will take the cardNumber and cardSuit Parameters and return 
  a String value for the cardDescrip variable in main.
 @param cn will take in the card number 
 @param cs will take in the card suit
  @return Will return a string of the card description
  */  
  public static String showCardDescrip(int cN, int cS)
  {
     String cardDescrip = "";
     
     while (cS == 1)
     {
        if (cN == 1)
        {
           cardDescrip = "Ace of Hearts"; 
           return cardDescrip;
        }
        else if (cN == 2)
        {
           cardDescrip = "2 of Hearts"; 
           return cardDescrip;
        }
        else if (cN == 3)
        {
           cardDescrip = "3 of Hearts"; 
           return cardDescrip;
        }
        else if (cN == 4)
        {
           cardDescrip = "4 of Hearts"; 
           return cardDescrip;
        }
        else if (cN == 5)
        {
           cardDescrip = "5 of Hearts"; 
           return cardDescrip;
        }
        else if (cN == 6)
        {   
           cardDescrip = "6 of Hearts"; 
           return cardDescrip;
        }
        else if (cN == 7)
        {
           cardDescrip = "7 of Hearts"; 
           return cardDescrip;
        }
        else if (cN == 8)
        {
           cardDescrip = "8 of Hearts"; 
           return cardDescrip;
        }
        else if (cN == 9)
        {
           cardDescrip = "9 of Hearts"; 
           return cardDescrip;
        }
        else if (cN == 10)
        {
           cardDescrip = "10 of Hearts"; 
           return cardDescrip;
        }
        else if (cN == 11)
        {
           cardDescrip = "Jack of Hearts"; 
           return cardDescrip;
        }
        else if (cN == 12)
        {
           cardDescrip = "Queen of Hearts"; 
           return cardDescrip;
        }
        else 
        {
           cardDescrip = "King of Hearts"; 
           return cardDescrip;
        }
     }
     while (cS == 2)
     {
        if (cN == 1)
        {
           cardDescrip = "Ace of Clubs"; 
           return cardDescrip;
        }
        else if (cN == 2)
        {
           cardDescrip = "2 of Clubs"; 
           return cardDescrip;
        }
        else if (cN == 3)
        {
           cardDescrip = "3 of Clubs"; 
           return cardDescrip;
        }
        else if (cN == 4)
        {
           cardDescrip = "4 of Clubs"; 
           return cardDescrip;
        }
        else if (cN == 5)
        {
           cardDescrip = "5 of Clubs"; 
           return cardDescrip;
        }
        else if (cN == 6)
        {
           cardDescrip = "6 of Clubs"; 
           return cardDescrip;
        }
        else if (cN == 7)
        {
           cardDescrip = "7 of Clubs"; 
           return cardDescrip;
        }
        else if (cN == 8)
        {
           cardDescrip = "8 of Clubs"; 
           return cardDescrip;
        }
        else if (cN == 9)
        {
           cardDescrip = "9 of Clubs"; 
           return cardDescrip;
        }
        else if (cN == 10)
        {
           cardDescrip = "10 of Clubs"; 
           return cardDescrip;
        }
        else if (cN == 11)
        {
           cardDescrip = "Jack of Clubs"; 
           return cardDescrip;
        }
        else if (cN == 12)
        {
           cardDescrip = "Queen of Clubs"; 
           return cardDescrip;
        }
        else 
        {
           cardDescrip = "King of Clubs"; 
           return cardDescrip;
        }
     }
     while (cS == 3)
     {
        if (cN == 1)
        {
           cardDescrip = "Ace of Diamonds"; 
           return cardDescrip;
        }
        else if (cN == 2)
        {
           cardDescrip = "2 of Diamonds"; 
           return cardDescrip;
        }
        else if (cN == 3)
        {
           cardDescrip = "3 of Diamonds"; 
           return cardDescrip;
        }
        else if (cN == 4)
        {
           cardDescrip = "4 of Diamonds"; 
           return cardDescrip;
        }
        else if (cN == 5)
        {
           cardDescrip = "5 of Diamonds"; 
           return cardDescrip;
        }
        else if (cN == 6)
        {
           cardDescrip = "6 of Diamonds"; 
           return cardDescrip;
        }
        else if (cN == 7)
        {
           cardDescrip = "7 of Diamonds"; 
           return cardDescrip;
        }
        else if (cN == 8)
        {
           cardDescrip = "8 of Diamonds"; 
           return cardDescrip;
        }
        else if (cN == 9)
        {
           cardDescrip = "9 of Diamonds"; 
           return cardDescrip;
        }
        else if (cN == 10)
        {
           cardDescrip = "10 of Diamonds"; 
           return cardDescrip;
        }
        else if (cN == 11)
        {
           cardDescrip = "Jack of Diamonds"; 
           return cardDescrip;
        }
        else if (cN == 12)
        {  
           cardDescrip = "Queen of Diamonds"; 
           return cardDescrip;
        }
        else  
        {
           cardDescrip = "King of Diamonds"; 
           return cardDescrip;
        }
     }
     while (cS == 4)
     {
        if (cN == 1)
        {
           cardDescrip = "Ace of Spades"; 
           return cardDescrip;
        }
        else if (cN == 2)
        {
           cardDescrip = "2 of Spades"; 
           return cardDescrip;
        }
        else if (cN == 3)
        {
           cardDescrip = "3 of Spades"; 
           return cardDescrip;
        }
        else if (cN == 4)
        {
           cardDescrip = "4 of Spades"; 
           return cardDescrip;
        }
        else if (cN == 5)
        {
           cardDescrip = "5 of Spades"; 
           return cardDescrip;
        }
        else if (cN == 6)
        {   
           cardDescrip = "6 of Spades"; 
           return cardDescrip;
        }
        else if (cN == 7)
        {   
           cardDescrip = "7 of Spades"; 
           return cardDescrip;
        }
        else if (cN == 8)
        {   
           cardDescrip = "8 of Spades"; 
           return cardDescrip;
        }
        else if (cN == 9)
        {   
           cardDescrip = "9 of Spades"; 
           return cardDescrip;
        }
        else if (cN == 10)
        {   
           cardDescrip = "10 of Spades"; 
           return cardDescrip;
        }
        else if (cN == 11)
        {   
           cardDescrip = "Jack of Spades"; 
           return cardDescrip;
        }
        else if (cN == 12)
        {   
           cardDescrip = "Queen of Spades"; 
           return cardDescrip;
        }
        else  
        {   
           cardDescrip = "King of Spades"; 
           return cardDescrip;
        }
     }
  return cardDescrip;
  }
  
  private static int cardValueGen( int cn)
  {
	  Scanner keyboard = new Scanner(System.in);
	  int value = 0;
	 
	  if (cn == 1)
	  {
		  
		  System.out.println("You have an ace will it be worth 1, or 11? ");
		  int userChoice = keyboard.nextInt();
		  System.out.println();
		  if (userChoice == 11)
		  {
			  value = 11;
			  
		  }
		  else
			  value = 1;
		  	
	  }
	  else if (cn == 2)
	  {
		  value = 2;
		  
	  }
	  else if (cn == 3)
	  {
		  value = 3;
		  
	  }
	  else if (cn == 4)
	  {
		  value = 4;
		  
	  }
	  else if (cn == 5)
	  {
		  value = 5;
		  
	  }
	  else if (cn == 6)
	  {
		  value = 6;
		  
	  }
	  else if (cn == 7)
	  {
		  value = 7;
		  
	  }
	  else if (cn == 8)
	  {
		  value = 8;
		  
	  }
	  else if (cn == 9)
	  {
		  value = 9;
		  
	  }
	  else if (cn == 10)
	  {
		  value = 10;
	  }
	  else if (cn == 11 || cn == 12 || cn ==13);
	  {
	  	value = 10;
	  }
	  
	
	  
	return value;
  
  }
	

				
			
}




