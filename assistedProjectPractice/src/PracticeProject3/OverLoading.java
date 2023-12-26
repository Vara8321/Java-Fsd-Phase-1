package PracticeProject3;

public class OverLoading {
	
	
	/*Method overloading same method name but differ in number of
	  parameters and data type of parameters*/
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
	
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[]) {

    	OverLoading ob=new OverLoading();
    	ob.area(10,12);
    	ob.area(5);  
   	}

}
