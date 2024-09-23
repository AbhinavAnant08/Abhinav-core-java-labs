package com.deloitte.lab3.ex6;

import java.util.Scanner;

public class Lab3Ex6 {
	
	public static boolean checkPoistiveString(String str)
	{
		for(int i = 0; i<str.length()-1; i++)
		{
			if (str.charAt(i) > str.charAt(i+1))
			return false;
			}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		
		if(checkPoistiveString(str))
			System.out.println(str + " is a positive string");
		else
			System.out.println(str + " is not a positive string");
		
		sc.close();
	}
}
