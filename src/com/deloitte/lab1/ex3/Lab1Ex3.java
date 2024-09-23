package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Lab1Ex3 {

	public int recursiveFibonacci(int n)
	{
		if (n<=2)
			return 1;
		
		else
		{
			return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
		}
	}
	
	public int nonRecursiveFibonacci(int n)
	{
		if (n<=2)
			return 1;
		
		int a =1, b=1, c=0;
		for(int i = 3; i<=n ; i++)
		{
			c= a+b;
			a=b;
			b=c;
		}
		return c;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a nmumber");
		int num = sc.nextInt();
		
		Lab1Ex3 obj = new Lab1Ex3();
		
		System.out.println("nth value of Fibonacci Series:");
		System.out.println("Using Recursion: "+ obj.recursiveFibonacci(num));
		System.out.println("Without Using Recursion: "+ obj.nonRecursiveFibonacci(num));
		
		sc.close();
	}
}
