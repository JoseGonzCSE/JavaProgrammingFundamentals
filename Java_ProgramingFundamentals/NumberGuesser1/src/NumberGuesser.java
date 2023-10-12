//Jose_Gonzalez
//Due: 4/20/20

public class NumberGuesser {

	// Used to maintain the original Inputs
	private int ogUpper;
	private int ogLower;
	
	// Used to do the Calculations
	private int upper;
	private int lower;
	
	private int midpoint;
	
	// Receives the lower and upper bound for the game, stores them in the appropriate location, and Retains their origional value 
	public NumberGuesser(int lowerBound, int upperBound) {
		
		ogUpper=upperBound;
		ogLower=lowerBound;
		
		
		
		lower= lowerBound;
		upper= upperBound;
		
	}
	
	// adjusts the game area to have higher values by increasing the lower limit
	public void higher() {
		lower=midpoint+1;
		
	}
	// adjusts the game area to have lower values by decreasing the upper limit 
	public void lower() {
		upper=midpoint-1;
	}
	
	// Calculates the midpoint and returns its value
	public int getCurrentGuess() {
		int Guess = (upper + lower)/2;
		midpoint=Guess;
		return midpoint;
	}
	// Returns the lower and upper limit to their original values
	public void reset() {
		lower=ogLower;
		upper=ogUpper;
		
	}
}
