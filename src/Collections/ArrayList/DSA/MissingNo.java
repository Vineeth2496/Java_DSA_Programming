package Collections.ArrayList.DSA;

import java.util.ArrayList;
import java.util.Iterator;

public class MissingNo {
/*
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		//System.out.println(a.size()+1);
//		int n=a.size()+1;
//		int exsum= n * (n +1) / 2;
//		System.out.println(exsum);
		
		System.out.println(missing_No(a));
	}
	
	public  static int missing_No(ArrayList<Integer> arr) {
		int n=arr.size()+1;
		int exsum = n * (n + 1) / 2;
		int actsum = 0;
		
		for (int num : arr) {
			actsum+=num;
		}
		
		return exsum-actsum;
	}
*/
	public static void main(String[] args) {
		ArrayList<Integer> arr=new  ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(6);
		arr.add(7);
		arr.add(9);
		arr.add(10);
		arr.add(12);
		
		
		Iterator<Integer> ii=arr.iterator();
		
//		for(int expected=1; ii.hasNext() ; expected++) {
//			int current=ii.next();
//			if(current != expected) {
//				System.out.println("Missing No: "+expected);
//			}
//			
//		}
		
		int expected=1;
		while(ii.hasNext()) {
			int current=ii.next();
			if(current != expected) {
				System.out.println(expected);
				expected=current;
				
			}
			expected++;
		}
	//	System.out.println(expected);
			
		
		
	}
	
}
