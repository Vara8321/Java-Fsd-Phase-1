package PracticeProject1;

public class TypeCasting {
public static void main(String[] args) {
		
		/*Implicit type casting is "Assigning a small date type value to 
		   to respectively big data type value, it is done Automatically"*/
		
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=b;
		System.out.println("Value of c: "+c);
				
		
		System.out.println("\nExplicit Type Casting\n");
		/*explicit type casting is "Assigning a big data type value
		  to smaller data type value"*/
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
		int var1=2;
		char var2= (char)var1;
		System.out.println("Value of var1: " +var1);
		System.out.println("Value of var2: " +var2);
		
		

	}
}
