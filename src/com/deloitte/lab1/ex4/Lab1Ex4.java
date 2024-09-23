package com.deloitte.lab1.ex4;

import java.util.Scanner;

public class Lab1Ex4 {
	
	public boolean checkPrime(int n)
	{	
		if(n<=1)
			return false;
		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a nmumber");
		int n = sc.nextInt();
		
		if(n<=1)
			System.out.println(n + "Enter a valid range");
		
		Lab1Ex4 obj = new Lab1Ex4();
		
		System.out.println("Prime numbers are: ");
		for(int i=0; i<=n; i++)
		{
			if (obj.checkPrime(i))
				System.out.println(i);
		}
		
		sc.close();
	
	}
}
