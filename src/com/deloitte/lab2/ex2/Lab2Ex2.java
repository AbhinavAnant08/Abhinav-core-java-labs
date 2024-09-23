package com.deloitte.lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex2 {
	
	public static String[] sortString(String[] arr)
	{
		Arrays.sort(arr);
		int len = arr.length;
		
		int mid = (len+1)/2;
		
		String[] result = new String[len];
		
		for(int i = 0; i<len;i++)
		{
			if( i <mid)
				result[i] = arr[i].toUpperCase();
			else
				result[i] = arr[i].toLowerCase();
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a size of array");
			int size = sc.nextInt();
			
			System.out.println("Enter the elements");
			String[] arr = new String[size];
			for(int i =0 ; i<size; i++)
				arr[i] = sc.next();
			
//			String[] arr = {"banana", "Apple", "orange", "grape", "kiwi", "pear"};
			String[] sortedArr = sortString(arr);
			
			System.out.println("\nSorted array: ");
			for(String i : sortedArr)
				System.out.print(i + "\t");
			
			sc.close();
		}
	}

}
