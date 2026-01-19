package com.Recursion;

import java.util.Scanner;

public class RecursionTest {

	public void function1(int i, int n) {
		if(i<1) {
			return;
		}
		function1(i-1, n);
		System.out.println(i);
	}
	public void function2(int i, int n) {
		if(i>n) {
			return;
		}
		function2(i+1, n);
		System.out.println(i);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N Values: ");
		int n=sc.nextInt();
		RecursionTest rt=new RecursionTest();
		//rt.function1(n,n);
		rt.function2(1,n);
	}

}
