package PracticeProject3;

public class CallByMethod {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		CallByMethod b=new CallByMethod();
		
		// b.multipynumbers(10,3) is calling a method
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		
		
		System.out.println(b.multipynumbers(3, 2));
		}

}
