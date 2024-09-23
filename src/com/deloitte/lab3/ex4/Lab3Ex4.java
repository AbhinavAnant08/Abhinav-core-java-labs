package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class Lab3Ex4 {

	public static int modifyNumber(int number1)
	{
		int result = 0;
		String num = Integer.toString(number1);
		for(int i = 0; i<num.length()-1; i++)
		{
			result = result*10 + Math.abs(num.charAt(i) - num.charAt(i+1));
		}
		result = result*10 + (num.charAt(num.length() -1) - '0');
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Modified number: "+ modifyNumber(num));
		
		sc.close();
	}
}
