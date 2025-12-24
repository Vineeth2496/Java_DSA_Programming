package Collections.ArrayList.DSA;

import java.util.Scanner;

public class MaxValue {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length:");
		int len=sc.nextInt(); 
		
		int arr[]=new int[len];
		System.out.println("Enter Array Elements: ");
		for(int i=0; i < len; i++) {
			arr[i]=sc.nextInt();
		}
		
		//Main logic
		int max=Integer.MIN_VALUE;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum values of array: " +max);
	}
}
