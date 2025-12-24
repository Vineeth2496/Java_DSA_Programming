package com.Patterns;

import java.util.Scanner;

public class SquarePattern {
	
	public void print1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void print2(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void print3(int n) {
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void print4(int n) {
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void print5(int n) {
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of Patterns");
		int t=sc.nextInt();
		for(int i=0; i<t; i++) {
			System.out.println("Enter Row & Column Length");
			int n=sc.nextInt();
				
			SquarePattern sp=new SquarePattern();
			//sp.print1(n);
			//sp.print2(n);
			//sp.print3(n);
			//sp.print4(n);
			sp.print5(n);
					
		}
	}

}
