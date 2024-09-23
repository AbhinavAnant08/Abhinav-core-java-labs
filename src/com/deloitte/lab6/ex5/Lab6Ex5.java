package com.deloitte.lab6.ex5;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6Ex5 {

	public static int getSecondSmallest(int[] arr)
	{
		
		Arrays.sort(arr);
		return arr[1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Second smallest integer: "+getSecondSmallest(arr));
		sc.close();
	}
}
