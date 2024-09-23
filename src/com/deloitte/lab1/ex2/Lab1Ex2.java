package com.deloitte.lab1.ex2;

import java.util.Scanner;

public class Lab1Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Red \n2. Yellow \n3. Green");
		System.out.println("Enter your choice");
		
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		default:
			System.out.println("Enter a valid choice");
		}
		sc.close();
	}

}
