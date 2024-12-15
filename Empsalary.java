package day04;
import java.util.Scanner;

public class Empsalary {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter employee salary:");
		double salary = obj.nextDouble();
		
		double percentage;
		
		if(salary <= 20000) {
			percentage =20.0;
		}else if(salary <= 40000) {
			percentage = 15.0;
		}else {
			percentage = 10.0;
		}
		
		double bonus = (percentage / 100) * salary;
		
		double gross_sal = salary + bonus;
		
		
		System.out.println("basic salary : " + salary);
		System.out.println("percentage : " + percentage);
		System.out.println("bonus : " + bonus);
		System.out.println("Gross salary is : " + gross_sal);
		
	}
}
