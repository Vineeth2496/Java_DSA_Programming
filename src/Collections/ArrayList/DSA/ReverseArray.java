package Collections.ArrayList.DSA;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of Array: ");
		int len=sc.nextInt();
		System.out.print("Enter Array of Elements: ");
		int arr[]=new int[len];
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
		}
		
		int i=0;
		int j=len-1;
		
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
		
		System.out.print("Reversal of Array: ");
		for(int k=0; k<len; k++) {
			System.out.print(arr[k]+" ");
			}
	}

}
