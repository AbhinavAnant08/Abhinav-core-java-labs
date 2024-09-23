package com.deloitte.lab3.ex3;

import java.util.Scanner;

public class Lab3Ex3 {
	
	public static boolean checkVowel(char ch) {
		
		if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return true;
		else
			return false;
	}
	
	public static String alterString(String str) {
		
		StringBuilder result = new StringBuilder();
		for(int i = 0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if (checkVowel(ch))
				result.append(ch);
			else
			{
				char nextChar = (char)(ch + 1);
				if(nextChar == 'z'+1)
					nextChar = 'z';
				else if(nextChar == 'Z'+1)
					nextChar = 'Z';
				result.append(nextChar);
			}			
		}
		return result.toString();	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		
		System.out.println("Altered image: "+alterString(str));
		sc.close();
	}
}
