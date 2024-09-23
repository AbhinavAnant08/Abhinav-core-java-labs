package com.deloitte.lab2.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex1 {
	
	public static int getSecondSmallest(int[] arr) {
		
		Arrays.sort(arr);
		return arr[1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		
		System.out.println("Enter the elements");
		int[] arr = new int[size];
		for(int i =0 ; i<size; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("second smalles element: "+ getSecondSmallest(arr));
		
		sc.close();
	}
}
