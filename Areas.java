package day04;
import java.util.Scanner;

public class Areas {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter radius of circle :");
		double radius = obj.nextDouble();
		
		System.out.println("Enter pependicular_height of triangle :");
		double per_height = obj.nextDouble();
		
		System.out.println("Enter base of triangle :");
		double base = obj.nextDouble();
		
		System.out.println("Enter first side of triangle :");
		double side1 = obj.nextDouble();
		
		System.out.println("Enter second side of triangle :");
		double side2 = obj.nextDouble();
		
		System.out.println("Enter third side of triangle :");
		double side3 = obj.nextDouble();
		
		
		System.out.println("for area of circle type - 1");
		System.out.println("for area of triangle type - 2");
		System.out.println("for circumference of circle type - 3");
		System.out.println("for peremeter of triangle type - 4");
		
		
		System.out.println("Enter your choice : ");
		int choice = obj.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Area of circle : " + 3.14*radius*radius);
			break;
		case 2:
			System.out.println("Area of Triangle : " + (per_height * base)/2);
			break;
		case 3:
			System.out.println("Circumference of circle : " + 2*3.14*radius);
			break;
		case 4:
			System.out.println("Perimeter of triangle : " + side1+side2+side3);
			break;
		default :
			System.out.println("Invalid Choice");		}
		
		
		
	}
}
