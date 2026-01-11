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
	public void print6(int n) {
		for(int i=1; i<=n; i++){
			for(int j=0; j<n-i+1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void print7(int n) {
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public void print8(int n) {
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i-1; j++){
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++){
				System.out.print("*");
			}
			for(int j=0; j<n-i-1; j++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public void print9(int n) {
		for(int i=0; i<n; i++){
			for(int j=0; j<i; j++){
				System.out.print(" ");
			}
			for(int j=0; j<2*n-(2*i+1); j++){
				System.out.print("*");
			}
			for(int j=0; j<i; j++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public void print10(int n) {
		for(int i=1; i<=2*n-1; i++){
			int stars=i;
			if(i>n) stars=2*n-i;
			for(int j=1; j<=stars; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void print11(int n) {
		int start=1;
		for(int i=0; i<n; i++){
			start = i%2==0 ? 1 : 0;
				
			for(int j=0; j<=i; j++){
				System.out.print(start);
				start=1-start;
			}
			System.out.println();
		}
	}
	public void print12(int n) {
		int space=2*(n-1);
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=1; j--){
				System.out.print(j);
			}
			System.out.println();
			space-=2;
		}
	}
	public void print13(int n) {
		int num=1;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(num+" ");
				num++;
			}System.out.println();
			
		}
	}
	public void print14(int n) {
		for(int i=0; i<n; i++){
			for(char ch='A'; ch<='A'+i; ch++){
				System.out.print(ch+" ");
			}System.out.println();
		}
	}
	public void print15(int n) {
		for(int i=0; i<n; i++){
			for(char ch='A'; ch<='A'+n-i-1; ch++){
				System.out.print(ch+" ");
			}System.out.println();
		}
	}
	public void print16(int n) {
		for(int i=0; i<n; i++){
			char ch=(char) ('A' +  i);
			for(int j=0; j<=i; j++){
				System.out.print(ch+" ");
			}System.out.println();
		}
	}
	public void print17(int n) {
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			char ch='A';
			int breakpoint= (2 * i +1)/2;
			for(int j=1; j<=2*i+1; j++){
				System.out.print(ch);
				if(j<=breakpoint) ch++;
				else	ch--;
				//ch = (char)(j<=breakpoint ? ch++ : ch--);
			}
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public void print18(int n) {
		for(int i=0; i<n; i++){
			for(char ch=(char)('E'-i); ch<='E'; ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
	public void print19(int n) {
		int space=0;
		for(int i=0; i<n; i++){
			for(int j=1; j<=n-i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
			space+=2;
		}
		space=2*n-2;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			space-=2;
			
		}
	}
	
	public void print20(int n) {
		int space=2*n-2;
		
		for(int i=1; i<=2*n-1; i++){
			int stars=i;
			if(i>n) stars=2*n-i;
			
			for(int j=1; j<=stars; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=stars; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<n) space-=2;
			else	space+=2;
		}
	}
	public void print21(int n) {
		
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n;j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
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
			//sp.print5(n);
			//sp.print6(n);
			//sp.print7(n);
			//sp.print8(n);
			//sp.print9(n);
			//sp.print10(n);
			//sp.print11(n);
			//sp.print12(n);
			//sp.print13(n);
			//sp.print14(n);
			//sp.print15(n);
			//sp.print16(n);
			//sp.print17(n);
			//sp.print18(n);
			//sp.print19(n);
			//sp.print20(n);
			sp.print21(n);
			
		}
	}

}
