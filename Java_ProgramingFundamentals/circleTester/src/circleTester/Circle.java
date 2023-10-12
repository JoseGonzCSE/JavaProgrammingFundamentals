package circleTester;

public class Circle {
// Jose_Gonzalez
	
	
	private double radius;
	private double x;
	private double y;
	
	// sets and gets the X Point
	public void setX (double xIn) {
		x= xIn;
	}
	public double getX() {
		return x;
	}
	
	//Sets and gets the Y points
	public void setY(double yIn) {
		y = yIn;
	}
	public double getY(){
		return y;
	}
	
	// Sets and gets the Radius
	public void setRadius(double radiusIn) {
		radius = radiusIn;
	}
	public double getRadius() {
		return radius;
	}
	
	// Calculates the Area of the circle
	public double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}
	
	// determines if two circle overlap
	public boolean doesOverlap( Circle  other) {
		
		double distance;
		//gets the coordinates of the first circle
		double x1 = x; 
		double y1 = y;
		//gets the coordinates of the second circle that is being compared to the first
		double x2 = other.getX(); 
		double y2 = other.getY(); 
		
		//equates the first step in the distance formula
		double xDiffSquared = Math.pow(x2 - x1, 2); 
		double yDiffSquared = Math.pow(y2 - y1, 2);
		//finishes the distance formula and puts the answer into distance
		distance= Math.sqrt(xDiffSquared + yDiffSquared);
		// calculates if there is overlap between the two selected circles
		if(radius+other.getRadius() >= distance) {
			return true;
		}else {
			return false;
		}
		
	}
	
}