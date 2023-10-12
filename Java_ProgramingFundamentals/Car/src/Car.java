
public class Car {

	protected double speed;
	protected double Location;
	
	
	public void Set() {
		speed=0;
		Location location= new Location(0,0);
		
		this.Location=location;
		
	}
	public void construct(double x, double location) {
		
	}
	
	
	
	public double getSpeed() {
		return speed;
	}
	public double getLocation() {
		return Location;
	}
	public void stop() {
		speed=0;
	}
	
	
}
