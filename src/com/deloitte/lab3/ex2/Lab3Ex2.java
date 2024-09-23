package com.deloitte.lab3.ex2;

import java.util.Scanner;

public class Lab3Ex2 {

	public static String getImage(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		str = str +"|"+ sb.reverse().toString();
		return str;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		
		System.out.println("Mirror image: "+getImage(str));
		sc.close();
	}
}
