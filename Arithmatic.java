package day04;
import java.util.Scanner;

public class Arithmatic {
	public static void main(String args[]) {
		
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		double num1 = obj.nextDouble();
		
		System.out.println("Enter second number : ");
		double num2 = obj.nextDouble();
		
		double add = num1 + num2;
		double sub = num1 - num2;
		double mul = num1 * num2;
		double div = num1 / num2;
		double mod = num1 % num2;
		
		System.out.println("for addition type - 1 ");
		System.out.println("for subtraction type - 2 ");
		System.out.println("for multiplication type - 3 ");
		System.out.println("for division type - 4 ");
		System.out.println("for modulus type - 5 ");
		
		System.out.println("Enter your choice: ");
		int choice = obj.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Addition = " + add);
			break;
		case 2:
			System.out.println("Subtraction = " + sub);
			break;
		case 3:
			System.out.println("Multiplication = " + mul);
			break;
		case 4:
			System.out.println("Division = " + div);
			break;
		case 5:
			System.out.println("Modulus = " + mod);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		
		
		
	}
}
