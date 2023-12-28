package PracticeProject5;

import java.util.Scanner;

public class ThrowsDemo {
	
	public void division(int n1,int n2) throws Exception{
		int result=0;
		result=n1/n2;
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two numbers for calculation");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		ThrowsDemo t1=new ThrowsDemo();
		try {
			t1.division(num1,num2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
