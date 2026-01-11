package com.MathsOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
	//Reverse a number
	public static void print2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rev=0;
		while(n>0) {
			int lastdigit=n%10;
			rev=rev*10 + lastdigit;
			n/=10;
		}
		System.out.println("Reverse of a digit  is : "+ rev);
	}
	//Palindrome of Number
	public static boolean palindromeNumber(int n){
        int originalNo=n;
        int rev=0;
        while(n>0){
            int lastdigit=n%10;
            rev=rev*10+lastdigit;
            n/=10;
        }
        if(rev==originalNo){
            return true;
        }else{
            return false;
        }
    }
	
	public static boolean isArmstrong(int num)
	{
		int originalno=num;
		int temp=num;
		int k=0;
		while(temp>0){
			k++;
			temp/=10;
		}
		temp=num;
		int sum=0;
	      
	   while(temp>0){
		   int lastdigit=temp%10;
		   sum+=Math.pow(lastdigit, k);
		   temp/=10;
	   }
	  return sum==originalno;
	  
	}
	
    public static List< Integer > printDivisors(int n) {
        List<Integer> li=new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                li.add(i);
                if((n/i)!=i){
                    li.add((n/i));
                }
            }
        }
        Collections.sort(li);
        return li;

    }
    
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
	
	public static void main(String[] args) {
//		System.out.println("Count of Digits: "+ print1(7789));
//		print2();
//		System.out.println("No. is Palindrome : "+ palindromeNumber(1221));
//		System.out.println("No. is Armstrong : "+ isArmstrong(153));
//		System.out.println("Divisors  of a No. "+ printDivisors(45));
		
//		Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(isPrime(n));
//        sc.close();
	}

	
}
