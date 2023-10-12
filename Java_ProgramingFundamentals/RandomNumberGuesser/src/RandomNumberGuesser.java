import java.util.Random;
public class RandomNumberGuesser extends NumberGuesser{

	
	private boolean test;
	private int randMidpoint;
	private Random nRandom;
	
	
	public RandomNumberGuesser(int lowerBound, int upperBound) {
		super(lowerBound, upperBound);
	
		test=true;
		nRandom= new Random();
	}
	
	public int getCurrentGuess() {
		
		
		
		if(test) {
			randMidpoint= lower +(nRandom.nextInt((upper-lower)+1));
			test=false;
		}return randMidpoint;
	}
	
	
	
	public void lower() {
		super.lower();
		test=true;
	}
	public void higher() {
		super.higher();
		test=true;
	}
	public void reset() {
		super.reset();
		test=true;
	}
	
}