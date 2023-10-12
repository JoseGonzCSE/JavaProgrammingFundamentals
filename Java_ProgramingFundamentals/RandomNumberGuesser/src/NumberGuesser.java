
public class NumberGuesser {

	// Used to maintain the original Inputs
	private int ogUpper;
	private int ogLower;
	
	// Used to do the Calculations
	protected int upper;
	protected int lower;
	

	
	// Receives the lower and upper bound for the game, stores them in the appropriate location, and Retains their origional value 
	public NumberGuesser(int lowerBound, int upperBound) {
		
		ogUpper=upperBound;
		ogLower=lowerBound;
		
		
		
		this.lower= lowerBound;
		this.upper= upperBound;
		
	}
	
	// adjusts the game area to have higher values by increasing the lower limit
	public void higher() {
		lower=getCurrentGuess()+1;
		
	}
	// adjusts the game area to have lower values by decreasing the upper limit 
	public void lower() {
		upper=getCurrentGuess()-1;
	}
	
	// Calculates the midpoint and returns its value
	public int getCurrentGuess() {
		return (upper-lower)/2;
	}
	// Returns the lower and upper limit to their original values
	public void reset() {
		lower=ogLower;
		upper=ogUpper;
		
	}
}
