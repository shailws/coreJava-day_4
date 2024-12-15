package day04;
import java.util.Scanner;

public class Largenum {
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int num1 = obj.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = obj.nextInt();
		
		System.out.println("Enter third number:");
		int num3 = obj.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("Greater number is : " + num1);
			}
			else {
				System.out.println("Greater number is : " + num3);
			}
		}
		else {
			if(num2 > num3) {
				System.out.println("Greater number is : " + num2);
			}
			else {
				System.out.println("Greater number is : " + num3);
			}
		}
	}
}
