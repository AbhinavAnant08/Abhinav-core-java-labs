package com.deloitte.lab6.ex7;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6Ex7 {

	public static int[] getSorted(int[] arr) {
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = Integer.parseInt(new StringBuilder(Integer.toString(arr[i])).reverse().toString());
		}
		
		Arrays.sort(arr);
		return arr;
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
		
		System.out.println("Sorted array: ");
		for(int num: getSorted(arr))
			System.out.print(num +" ");
		sc.close();
	}
}
