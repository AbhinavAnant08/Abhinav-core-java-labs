package com.deloitte.lab1.ex8;

import java.util.Scanner;

public class Lab1Ex8 {

	public static boolean checkNumber(int n)
	{
		if (n<= 0)
			return false;
		
		while(n % 2 == 0)
			n = n/2;
		
		return n==1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if(checkNumber(num))
			System.out.println(num + " is power of 2");
		else
			System.out.println(num + " is not power of 2");
		
		sc.close();
	}
}
