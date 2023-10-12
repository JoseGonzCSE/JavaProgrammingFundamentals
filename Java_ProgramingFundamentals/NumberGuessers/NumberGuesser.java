
public class NumberGuesser {
	
	protected int high;
	protected int low;
	
	private int originalHigh;
	private int originalLow;
	private int decision;
	
	public NumberGuesser(int l, int h) {
		low = originalLow = l;
		high = originalHigh = h;
		decision= getCurrentGuess();
	}
	
	public int getCurrentGuess() {
		return (high + low) / 2;
	}
	
	public void higher() throws IllegalStateException{
		if(getCurrentGuess()==decision||getCurrentGuess()== high && high!=originalHigh) {
			throw new IllegalStateException("Did something happen?");
		}
		low = getCurrentGuess() + 1;
	}
	
	public void lower()throws IllegalStateException {
		if(getCurrentGuess()==decision||getCurrentGuess()== high && high!=originalHigh) {
			throw new IllegalStateException("Did something happen?");
		}
		high = getCurrentGuess() - 1;
	}
	
	public void reset() {
		low = originalLow;
		high = originalHigh;
	}
}