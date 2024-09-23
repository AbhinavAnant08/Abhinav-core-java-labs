package com.deloitte.lab1.ex6;

import java.util.Scanner;

public class Lab1Ex6 {
	
	public static int calculateDifference(int n)
	{
		int sum = 0, sumOfSq = 0;;
		for(int i = 1; i<=n; i++)
		{
			sum += i;
			sumOfSq += i * i;
		}
		
		return sum*sum - sumOfSq;
	}
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a nmumber");
		int n = sc.nextInt();
		
		System.out.println("Difference: " + calculateDifference(n));
		
		sc.close();
	}

}
