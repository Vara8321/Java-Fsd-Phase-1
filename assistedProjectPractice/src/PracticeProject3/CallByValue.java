package PracticeProject3;

public class CallByValue {

	int val=150;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		CallByValue d = new CallByValue();
		
		// d.val is calling a value 
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		System.out.println(d.operation(100));
		}

}
