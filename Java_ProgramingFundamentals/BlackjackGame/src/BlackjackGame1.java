/* Created by: Jose_Gonzalez
   Due date: 4/5/20
   I apologize in advance for the sloppy code I'm positive one could condense it by a good amount
 */

// This Program simulates BlackJack

import java.util.Scanner; 
import java.util.Random;

public class BlackjackGame1 {
	
	public static void main(String[] args)
	{
		
		
		// Sets total to 0 as well as initiates necessary variables.
		int total = 0;
		int card1;
		int card2;
		char goAgain = 'y';
		char newMatch= 'y';
		int newCard; 
		//allows user input
		Scanner input = new Scanner(System.in);
			
			
			// Begins a new Round
			while (newMatch =='y'&& goAgain=='y')
			{
				// Randomizes two cards (from 1,10) and adds them to the Total.
				Random randomNumbers = new Random();
				card1= randomNumbers.nextInt(10)+1;
				card2=  randomNumbers.nextInt(10)+1;
				total = card1+card2;
				
				// Prints out the first two cards received and the Total
				System.out.println("First cards: " + card1+","+card2);
				System.out.println("Total: "+ total);
				
				// If player wins immediately congratulates them and asks if they would like to play another match 
				if(total==21)
				{
					System.out.println("First try?!?! Wow what luck! Now use that luck and play again!");
					newMatch = input.nextLine().charAt(0);
					
					//If player goes over, ends the game and resets everything: asks if they would like to play again
				    } else if(total>21){
				    	System.out.println("Sorry you're out of luck");
				    	System.out.println("Would you like to play again?(y/n):");
				    	newMatch = input.nextLine().charAt(0);
				    	
				    //	If the player does not win or loose asks if they would like to continue
				    }else  {
				    	System.out.println("Maybe you should go again... who knows, you might win. You are feeling lucky right?");
				    }
				
				
				
				//if player chooses to continue repeats the same code with one card being drawn instead of two
					while (goAgain=='y' && newMatch=='y')
				{
					System.out.println("Go again? (y/n): ");
					goAgain = input.nextLine().charAt(0);
					if (goAgain =='n')
					{break;}
					newCard = randomNumbers.nextInt(10)+1;
					total = total+ newCard;
					System.out.println("Total: "+ total);
					if(total==21)
					{
						System.out.println("you Win! Congratulations! Play Again? (y/n):");
						newMatch = input.nextLine().charAt(0);
						
					    } else if(total>21){
					    	System.out.println("Sorry you're out of luck");
					    	System.out.println("Would you like to start a new match? (y/n):");
					    	newMatch = input.nextLine().charAt(0);
					    	break;
					    }else  {
					    	System.out.println("Maybe you should go again... who knows, you might win. You are feeling lucky right?");
			   }
			}
				
		}
		
	}
}	
