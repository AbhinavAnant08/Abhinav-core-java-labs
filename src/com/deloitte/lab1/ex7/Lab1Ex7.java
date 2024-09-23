package com.deloitte.lab1.ex7;
import java.util.Scanner;

public class Lab1Ex7 {

	public static boolean checkNumber(int num){
		
		String str = Integer.toString(num);
		
		char[] arr = str.toCharArray();
		for(int i =0; i<arr.length-1; i++)
		{
			if(arr[i]<=arr[i+1])
				continue;
			else
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if(checkNumber(num))
			System.out.println(num + " is an increasing number");
		else
			System.out.println(num + " is not an increasing number");
		
		sc.close();
	}

}
