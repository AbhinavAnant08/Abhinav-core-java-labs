package com.deloitte.lab2.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {
	
	public static int[] getSorted(int[] arr)
	{
		for(int i =0; i<arr.length/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		
		System.out.println("Reversed array: ");
		for(int i : arr)
			System.out.print(i + "\t");
		
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		
		System.out.println("Enter the elements");
		int[] arr = new int[size];
		for(int i =0 ; i<size; i++)
			arr[i] = sc.nextInt();
		
		int[] sortedArr = getSorted(arr);
		
		System.out.println("\nSorted array: ");
		for(int i : sortedArr)
			System.out.print(i + "\t");
		
		sc.close();
	}

}
