package com.deloitte.lab6.ex2;

import java.util.HashMap;
import java.util.Scanner;

public class Lab6Ex2 {
	
	public static HashMap<Character, Integer> countChars(char[] arr){
		
		HashMap<Character, Integer> charCnt = new HashMap<>();
		
		for(char ch : arr)
			if(charCnt.containsKey(ch))
				charCnt.replace(ch, charCnt.get(ch)+1);
			else
				charCnt.put(ch, 1);
		
		return charCnt;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
		int n = sc.nextInt();
		
		char[] arr = new char[n];
		System.out.println("Enter the characters in array");
		for(int i = 0; i<n; i++)
			arr[i] = sc.next().charAt(0);
		
		System.out.println(countChars(arr));	
	}

}
