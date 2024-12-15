package day04;
import java.util.Scanner;

public class Grade {
	public static void  main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks = obj.nextInt();
		
		if(marks>=90 && marks<=100) {
			System.out.println("A grade");
		}
		else if(marks>=70 && marks<90) {
			System.out.println("B grade");
		}
		else if(marks>=50 && marks<70) {
			System.out.println("C grade");
		}
		else if(marks>=40 && marks<50) {
			System.out.println("D grade");
		}
		else if(marks>=0 && marks<40) {
			System.out.println("Falil");
		}
		else {
			System.out.println("Invalid marks!");
		}
	}
}
