
public class FlyingCar extends Car {

	private double altitude;
	
	public FlyingCar(double speed, double location, double altitude) {
		super(speed,location);
		this.altitude=altitude;
	}
	
	public void set(FlyingCar y) {
		
	}
	
	
	
	public double getAltitude(){
		return altitude;
	}
	
	public void land() {
		speed=0;
		altitude=0;
	}
	public boolean isHigherAndFaster(FlyingCar x) {
		if(x.getSpeed()>speed && x.getAltitude>altitude) {
			return true;
		}else return false;
	}
	
	
	
	// My mind is blank :(
	
	public static void landUnsafeCars(FlyingCar[] flying,paceCar.FlyingCar(),double hardDeck) {
		
		double carslanded;
		
		
		
		for(int i=0; i<)
		
			
			if(FlyingCar[i]>paceCar||FlyingCar[i].getAltitude<hardDeck) {
				FlyingCar[i].land();
			}
			
			
	
			return carslanded;
	}
	
	
	
	
	
	
}
