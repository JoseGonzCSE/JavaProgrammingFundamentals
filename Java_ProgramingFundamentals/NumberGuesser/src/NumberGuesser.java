// Jose_Gonzalez
//Due 4/8/20

// This code runs a number guesser game

import java.util.Scanner;

public class NumberGuesser {
	
	public static void main (String[] args) {
		do {
			playOneGame();
		} while (shouldPlayAgain());
	}
	
	
	// The actual Game
	
	public static void playOneGame()
	{
		
		int low=0;
		int high=100;
		int Guess;
		char response;
		
		System.out.println("Guess a number between 1 and 100.");
		do {
			Guess= getMidpoint(low,high);
			response= getUserResponseToGuess(Guess);
			
		if (response=='h')
		{
			low=Guess;
		}else if (response=='l')
		{
			high=Guess;
		}
		}while(response!='c');
		
	}
	
	
	
	
	// Asks the user if they would like to play again
	public static boolean shouldPlayAgain ()
	{
		Scanner Input = new Scanner(System.in);
		
		char goAgain;
		System.out.println("Great! do you want to play again? (y/n): ");
		goAgain= Input.nextLine().charAt(0);
			
		boolean status;
		if (goAgain =='y')
			status= true;
		else
			status= false;
		return  status;
	}
	
	// Ask the user if their guess is higher/lower/or the same as the predicted value
	public static char getUserResponseToGuess (int Guess)
	{
		 
		System.out.println("Is it " + Guess + "? (h/l/c):" );
		Scanner Input = new Scanner(System.in);
		Guess= Input.nextLine().charAt(0);
		return (char)Guess;
		
	
		
		
		
	}
	
	// Gets two numbers as input and calculates/ returns the midpoint
	public static int getMidpoint (int low, int high)
	{
		
		
		int midpoint= (low + high)/2;
		return midpoint;
		
		
		
	}
	
}
