package com.deloitte.lab3.ex5;

import java.util.Scanner;

public class LabEx5 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string, put '.' for a new line");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int noOfChar = 0; int noOfWords = 0; int noOfLines = 0;
		
		noOfChar = str.length();
		
        String[] words = str.split(" ");
        
        noOfWords = words.length;
		
		for(int i =0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch == '.')
				noOfLines++;

		}
		
		System.out.println("no. of characters: "+ noOfChar );
		System.out.println("no. of words: "+ noOfWords);
		System.out.println("no. of Lines: "+ ++noOfLines);
		
		sc.close();
	}

}
