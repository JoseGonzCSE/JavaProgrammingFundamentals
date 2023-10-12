package circleTester;
//Jose_Gonzalez

public class CircleTester {

	public static void main(String[] args) {
		//Creates a new CircleA
		Circle circle_A= new Circle();
		
		circle_A.setX(5);
		circle_A.setY(10);
		circle_A.setRadius(4);
		
		
		
		//Prints out the Area of Circle A
		System.out.println("The area of Circle A is " + circle_A.getArea());
		
		//Creates new circleB
		Circle circle_B= new Circle();
		circle_B.setX(2);
		circle_B.setY(4);
		circle_B.setRadius(3);
		
	
		
		//Prints out the Area of Circle B
		System.out.println("The area of Circle B is " + circle_B.getArea());
		
		//Creates Circle C
		Circle circle_C= new Circle();
		
		circle_C.setX(15);
		circle_C.setY(10);
		circle_C.setRadius(2);
		
		
		//Prints out the Area of CircleC
		System.out.println("The area of Circle C is " + circle_C.getArea());
		
		//Checks to see if there is Overlap or Not
		System.out.println( circle_A.doesOverlap( circle_B ));
		System.out.println( circle_C.doesOverlap( circle_A ));
		System.out.println( circle_C.doesOverlap( circle_B ));
		
		
	}
	
	
	
	
}
