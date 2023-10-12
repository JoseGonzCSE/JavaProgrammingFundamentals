
public class Circle_Test {
	public static void main(String[] args) {
		//tests for the four Constructors
		Point p= new Point(40,60);
		
		Circle circle_A= new Circle(p,15);
		Circle circle_B= new Circle(5,10,20);
		Circle circle_C= new Circle();
		Circle circle_D= new Circle(circle_B);
		Circle circle_EqualsTest= new Circle(5,10,20);
		
		//Tests for the toString method
		System.out.println("Circle_A"+"\n"+circle_A);
		System.out.println("Circle_B"+"\n"+circle_B);
		System.out.println("Circle_C"+"\n"+circle_C);
		System.out.println("Circle_D"+"\n"+circle_D);
		
		//Tests the equals Method
		System.out.println("Testing for Equals:");
		System.out.println(circle_A.equals(circle_B));
		System.out.println(circle_B.equals(circle_D)+"\n");
		
		//Tests the doesOverlap method
		System.out.println("Testing for Overlap:");
		System.out.println(circle_A.doesOverlap(circle_B));
		System.out.println(circle_B.doesOverlap(circle_D));
		
		
		
		
	}
}
