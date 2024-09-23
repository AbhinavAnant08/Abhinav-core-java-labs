package com.deloitte.lab9.ex5;

import java.util.Scanner;

interface calcFactorial{
	public void Fact(int n);
}

public class Lab9Ex5 {

	public static void Factorial(int num)
	{
		int factValue = 1;
		
		for(int i=1;i<=num;i++)
			factValue *= i;
		
		System.out.println("Factorail of "+num+": "+factValue);	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		calcFactorial fact = Lab9Ex5::Factorial;
		fact.Fact(num);
		
		sc.close();
	}
	
}
