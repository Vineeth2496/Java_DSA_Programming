package Collections.ArrayList.DSA;

import java.util.Scanner;

public class SubArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Array: ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		System.out.print("Enter Array Elements: ");
		for(int i=0; i < len; i++) {
			arr[i]=sc.nextInt();
		}
		
		int si=0;
		int ei=0;
		for(si=0; si < len; si++) {
			for(ei=si; ei < len; ei++) {
				for(int k=si ; k <= ei; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
		
	}

}
