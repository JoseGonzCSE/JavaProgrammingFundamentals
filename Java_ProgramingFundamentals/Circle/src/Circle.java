
public class Circle {

	private double radius;
	private double x;
	private double y;
	
	public void setX (double xIn) {
		x= xIn;
	}
	public double getX() {
		return x;
	}
	
	public void setY(double yIn) {
		y = yIn;
	}
	public double getY(){
		return y;
	}
	
	
	public void setRadius(double radiusIn) {
		radius = radiusIn;
	}
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}
	
	public boolean doesOverlap(Circle otherCircle) {
		
	}
	
}
