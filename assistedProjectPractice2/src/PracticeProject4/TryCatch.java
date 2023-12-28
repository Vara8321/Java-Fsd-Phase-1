package PracticeProject4;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		float result=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two numbers for calculation");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("division of two numbers");
		try {
			result=num1/num2;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divisible by zero");
		}
		finally {
			System.out.println("Thank You");
		}
		sc.close();
	}

}
