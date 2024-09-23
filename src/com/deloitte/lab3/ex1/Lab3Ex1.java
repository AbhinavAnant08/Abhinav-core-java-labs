package com.deloitte.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Ex1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Enter the integers");
		String inp = sc.nextLine();
		StringTokenizer str = new StringTokenizer(inp);
		
		System.out.println("The integers are: ");
		while(str.hasMoreTokens())
		{
			String token = str.nextToken();
			System.out.println(token);
			sum += Integer.parseInt(token);
		}
		
		System.out.println("sum of integrs: "+ sum);
		sc.close();
	}

}
