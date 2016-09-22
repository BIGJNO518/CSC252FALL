
import javax.swing.JOptionPane;
import java.util.*;
public class PlayGames 
{

	
	private Object userInput;

	public static void main (String[] args) 
	{
		PlayGames holdChoice = new PlayGames();
	    PlayGames userChoice = new PlayGames();
		
      userChoice.userInput(); //holds our method for gaining user input
		holdChoice.inputConditions(userChoice.userInput);
	
	
	}
	
	public int userInput()
	{
		String userChoice;
		int numChosen;
		
		userChoice = JOptionPane.showInputDialog (null, "What game would you like to play?\n\n " +
													"Press 1 for the Dice Game. Press 2 for the Card Game. Press 3 to Quit.");
		numChosen = Integer.parseInt(userChoice);
		
				return numChosen;
		
	}

	private void inputConditions(Object uc)
	{
		
		if (uc == 1)
		{
			JOptionPane.showMessageDialog(null, "You have chosen the Dice Game.");
			int playDice = diceGameGenerator();
				 
		}
			
		else if (uc ==2)
		{
			JOptionPane.showMessageDialog(null, "You have chosen BlackJack.");
			//return method call for card game
			
		}
			
		else if  (uc == 3)
		{
			JOptionPane.showMessageDialog(null, "Goodbye");
				
		}
		else 
			JOptionPane.showMessageDialog(null, "You have entered an ivalid key");
		
	}/** @ return returns the individual and total rolls of six dice chosen
           */ 
	public int diceGameGenerator()
	{
		Random diceGenerator = new Random ();
		
			int totalOfDice = 0;
			String numChoice = JOptionPane.showInputDialog(null, "How many dice will you roll?");
			int finalNumber = Integer.parseInt(numChoice);
			
			while (finalNumber > 0 && finalNumber <7)
			{
				String totalRollCapture = JOptionPane.showInputDialog(null, "Guess what your total roll will be:");
				 int totalRoll = Integer.parseInt(totalRollCapture);
			while((totalRoll > 0) && (totalRoll <37))
			{
				JOptionPane.showMessageDialog(null, "You guessed: " + totalRoll);
			  /** @ return returns the individual and total rolls of six dice chosen
           */ 
				if (finalNumber == 6)
				{
					int firstDie = diceGenerator.nextInt(5) + 1;
					int secondDie = diceGenerator.nextInt(5) + 1;
					int thirdDie = diceGenerator.nextInt(5) + 1;
					int fourthDie = diceGenerator.nextInt(5) + 1;
					int fifthDie = diceGenerator.nextInt(5) + 1;
					int sixthDie = diceGenerator.nextInt(5) + 1;
					totalOfDice = (firstDie + secondDie + thirdDie +
									fourthDie + fifthDie + sixthDie);
					
					return firstDie; 
					return secondDie;
					return thirdDie; 
					return fourthDie; 
					return fifthDie; 
					return sixthDie;
					return totalOfDice;
				
				}
				else if (finalNumber == 5)
				{	
					int firstDie = diceGenerator.nextInt(5) + 1;
					int secondDie = diceGenerator.nextInt(5) + 1;
					int thirdDie = diceGenerator.nextInt(5) + 1;
					int fourthDie = diceGenerator.nextInt(5) + 1;
					int fifthDie = diceGenerator.nextInt(5) + 1;
					int sixthDie = diceGenerator.nextInt(5) + 1;
					
					totalOfDice = (firstDie + secondDie + thirdDie 
								+fourthDie + fifthDie);
					
					return firstDie; 
					return secondDie;
					return thirdDie; 
					return fourthDie; 
					return fifthDie; 
					return totalOfDice;
            }
	         else if (finalNumber == 4)
				{	
					int firstDie = diceGenerator.nextInt(5) + 1;
					int secondDie = diceGenerator.nextInt(5) + 1;
					int thirdDie = diceGenerator.nextInt(5) + 1;
					int fourthDie = diceGenerator.nextInt(5) + 1;
				
					totalOfDice = firstDie + secondDie + thirdDie +fourthDie;
					return firstDie;
               return secondDie;
               return thirdDie;
               return fourthDie;
					return totalOfDice;
				}
				else if (finalNumber == 3)
				{	
					int firstDie = diceGenerator.nextInt(5) + 1;
					int secondDie = diceGenerator.nextInt(5) + 1;
					int thirdDie = diceGenerator.nextInt(5) + 1;
					
					totalOfDice = firstDie + secondDie + thirdDie; 
					return firstDie;
					return secondDie;
					return thirdDie;
					return totalOfDice;
				}
				else if (finalNumber == 2)
				{	
					int firstDie = diceGenerator.nextInt(5) + 1;
					int secondDie = diceGenerator.nextInt(5) + 1;
					
					totalOfDice = firstDie + secondDie;
					return firstDie; 
					return secondDie;
					return totalOfDice;
				}
				else  
				{	
					int firstDie = diceGenerator.nextInt(5) + 1;
					
					int totalOfDice = firstDie;
					return firstDie;
					return totalOfDice;
				
				}	


