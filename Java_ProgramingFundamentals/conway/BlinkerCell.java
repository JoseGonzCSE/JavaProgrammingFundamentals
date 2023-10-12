
public class BlinkerCell extends AbstractCell {
	
	public BlinkerCell(int r, int c,ConwayWorld w) {
		super(r,c,w);
	}
	
	public  AbstractCell cellForNextGeneration() {
		return this;
	}
	public boolean willBeAliveInNextGeneration() {
		return true;
	}
	public boolean getIsAlive() {
		return false;
	}
	public char displayCharacter() {
		if(getIsAlive()==false) {
			return 'X';
		}else 
			return '+';
	}
}
