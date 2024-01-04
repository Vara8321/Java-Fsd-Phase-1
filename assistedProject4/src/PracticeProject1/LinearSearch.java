package PracticeProject1;

import java.util.Scanner;

public class LinearSearch {
	
	public int Linear(int arr[],int num) {
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr= {100,20,30,400,50,60,};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to be searched");
		int num=sc.nextInt();
		
		LinearSearch ns=new LinearSearch();
		int result=ns.Linear(arr, num);
		
		if(result==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println(num + " found at array location " + result);
		}
		sc.close();
	}

}
