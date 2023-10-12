import java.util.Scanner;

public class RandomNumberGame {
	public static void main(String[] args) {
		do {
			playOneGame();
		} while (shouldPlayAgain());
	}
		
		
		
	// The actual Game
	public static void playOneGame() {
		int Guess;
		char response;
		
		RandomNumberGuesser Game= new RandomNumberGuesser(1,100);
		
		System.out.println("Guess a number between 1 and 100.");
		
		do {			
			
			Guess=(Game.getCurrentGuess());
			response= getUserResponseToGuess(Guess);
		
		if(response=='h') {
			Game.higher();
		}else if(response=='l') {
			Game.lower();
		}
			
		
		}while(response!='c');
	
	}
	
	// Asks the user if they would like to play again
	public static boolean shouldPlayAgain () {
		
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
}