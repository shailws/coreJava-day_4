package day04;
import java.util.Scanner;

public class Largeno {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		double num1 = obj.nextDouble();
		
		System.out.println("Enter second number : ");
		double num2 = obj.nextDouble();
		
		System.out.println("Enter third number : ");
		double num3 = obj.nextDouble();
		
		System.out.println("Enter four number : ");
		double num4 = obj.nextDouble();
		
		double largestno = num1;
		
		if(num2 > largestno) {
			largestno = num2;
			
			if(num3 > largestno) {
				largestno = num3;
				
				if(num4 > largestno) {
					largestno = num4;
				}
			}
		}
		
		System.out.println("Large number is : " + largestno);
	}
}
