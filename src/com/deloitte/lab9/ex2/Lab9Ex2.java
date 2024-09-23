package com.deloitte.lab9.ex2;

import java.util.Scanner;

public class Lab9Ex2 {
	
	interface addSpace{
		void space(String str);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str = sc.next();
		
		addSpace as = (inpStr) -> {
			
			String spaceString = new String();
			for(char ch: inpStr.toCharArray())
				spaceString = spaceString + " " +ch;
			
			System.out.println("String with space: "+ spaceString);
		};
		
		as.space(str);;
		
		sc.close();
	
	}
}
