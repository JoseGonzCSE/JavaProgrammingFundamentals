
public class AntiConway extends AbstractCell {
	public AntiConway(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}	

	public boolean willBeAliveInNextGeneration() {
		int nc = neighborCount();
		
		if (getIsAlive()) {
			return nc == 3;
		} else {
			return nc == 2||nc==3;
		}
	}
	
	public AbstractCell cellForNextGeneration() {
		AntiConway next = new AntiConway(getRow(), getColumn(), world);
		
		next.setIsAlive(willBeAliveInNextGeneration());
		
		return next;
	}
	
	public int neighborCount() {
		int count = 0;
		
		int row = getRow();
		int column = getColumn();
		
		for (int dc = -1; dc <= 1; dc++) {
			for (int dr = -1; dr <= 1; dr++) {
				if (world.isAlive(row + dc, column + dr) && !(dc == 0 && dr == 0)) {
					count++;
				}
			}
		}
		
		return count;
	}
}
