package Collections.ArrayList.DSA;

import java.util.Scanner;

public class AddNoWithoutOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number for addition: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		while(y!=0) {
			System.out.println("x: "+x+ ", y: "+ y);
			x++;
			y--;
			
		}
		System.out.println("Addition of two no:"+x);

	}

}
