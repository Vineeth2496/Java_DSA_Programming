package Sorting.Operations;

public class BubbleSort {

	public static void main(String[] args) {
		int num[]= {6,5,4,8,9,2};
		int size=num.length;
		int temp=0;
		System.out.println("Before sorting");
		for(int n : num) {
			System.out.print(n + " ");
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-i-1; j++) {
				if(num[j] > num [j+1]) {
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
			System.out.println();
			for(int n : num) {
				System.out.print(n + " ");
			}
		}	
		
		
		System.out.println();
		System.out.println("After sorting");
		for(int n : num) {
			System.out.print(n + " ");
		}
	}

}
