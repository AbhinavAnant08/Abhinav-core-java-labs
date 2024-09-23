package com.deloitte.lab1.ex1;

import java.util.*;

public class Lab1Ex1 {

	public int findSum(int num)
	{
		int sum = 0;
		for(int i = num; i > 0; i = i/10)
		{
			int d = i %10;
			sum +=  Math.pow(d, 3);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a nmumber");
		int num = sc.nextInt();
		
		Lab1Ex1 obj = new Lab1Ex1();
		System.out.println("SUm of cube of digit: "+ obj.findSum(num));
		
		sc.close();
		
	}
}
