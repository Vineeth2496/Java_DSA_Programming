package com.MathsOperations;

public class BasicMath {
	// Count of no. of digits
	public static int print1(int n) {
		int count=0;
		while(n>0) {
			int lastdigit=n%10;
			n/=10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println("Count of Digits: "+ print1(7789));
	}

}
