package Collections.ArrayList.Operations;

import java.util.ArrayList;

public class RemovePrimeNo {

	public static void main(String[] args) throws Exception{
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		System.out.println(list);
		
		for(int i=list.size()-1; i>=0; i--) {
//			for(int j=2; j*j<=list.get(i); j++) {
//				if(list.get(i)%j==0) {
//					list.remove(i);
//				}
//			}
			
			if(isPrime(list.get(i))) {
				list.remove(i);
			}
			
		}
		System.out.println(list);
	}
	
	private static boolean isPrime(int n) {
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
