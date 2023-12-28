package PracticeProject5;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float result=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two numbers for calculation");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("division of two numbers");
		try {
			if(num2==0) {
				throw new ArithmeticException("cannot divisible by zero");
			}else {
				result=num1/num2;
				System.out.println(result);
			}
		}catch(ArithmeticException e) {
			System.out.println("Cannot divisible by zero");
		}
		finally {
			System.out.println("Thank You");
		}

	}

}
