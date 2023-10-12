
public class Circle {
// Jose_Gonzalez
	
	private Point center;
	private double radius;
	
	
	public Circle(Point o, double r){
		center= new Point(o);
		radius= r;
	}
	
	public Circle(double xValue, double yValue, double r) {
		center = new Point(xValue,yValue);
		radius=r;
	}
	
	public Circle() {
		center= new Point(0,0);
		radius=1;
	}
	
	public Circle(Circle c) {
		center= c.center;
		radius= c.radius;
	}
	
	public void setCenter( Point p) {
		this.center=p;
	}
	
	public Point getCenter() {
		return center;
	}
	
	// sets and gets the X Point
	public void setX (double xIn) {
		center.setX(xIn);
	}
	public double getX() {
		return center.getX();
	}
	
	//Sets and gets the Y points
	public void setY(double yIn) {
		center.setY(yIn);
	}
	public double getY(){
		return center.getY();
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
	
	
	public String toString() {
		String Str = "X Value: "+ center.getX() + "\nY Value: " + center.getY() + "\nRadius: " + radius+"\n";
		return Str;
	}
	
	public boolean equals(Circle C) {
		if(this.center.equals(C.getCenter()) && (this.radius- C.getRadius() == 0)){
			return true;
		}else {return false;}
	}
		
	// determines if two circle overlap
	public boolean doesOverlap( Circle  other) {
		
		double distance;
		//gets the coordinates of the first circle
		double x1 = center.getX(); 
		double y1 = center.getY();
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