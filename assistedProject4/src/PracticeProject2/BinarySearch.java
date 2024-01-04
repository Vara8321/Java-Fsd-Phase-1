package PracticeProject2;

import java.util.Scanner;

public class BinarySearch {
	
	public void binary(int[] arr,int key,int start,int length) {
		
		int midvalue=(start+length)/2;
		
		while(start<=length) {
			if(arr[midvalue]<key) {
				start=midvalue+1;
			}else if(arr[midvalue]==key) {
				System.out.println(key + " is found at location " + midvalue);
				break;
			}else {
				length=midvalue-1;
			}
			midvalue=(start+length)/2;
		}
		if(start>length) {
			System.out.println("Element not Found");
		}
	}

	public static void main(String[] args) {
		
		int[] arr= {5,8,45,55,63,98,1066};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to be searched in array");
		int num=sc.nextInt();
		
		int length=arr.length;
		BinarySearch bs=new BinarySearch();
		bs.binary(arr, num, 0, length);
		

	}

}
