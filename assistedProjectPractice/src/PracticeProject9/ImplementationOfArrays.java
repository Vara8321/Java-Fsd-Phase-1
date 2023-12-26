package PracticeProject9;



public class ImplementationOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		arr[0]=45;
		arr[1]=55;
		arr[2]=65;
		arr[3]=20;
		arr[4]=50;
		
		System.out.println("array length: " + arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int sum=0;
		for(int i:arr) {
			sum =sum+i;
		}
		System.out.println("sum of elements in array: " + sum);
		
		System.out.println("\n");
		
		int[] arr1= {12,13,15};
		
		for(int a: arr1) {
			System.out.println(a);
		}
		
		//multidimensional arrays
		int [][] matrix= {{4,5,6},{5,1}};
		System.out.println(matrix[0][0]);
	}

}
