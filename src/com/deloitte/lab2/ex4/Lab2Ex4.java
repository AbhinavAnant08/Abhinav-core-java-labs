package com.deloitte.lab2.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab2Ex4 {
	
	public static int[] modifyArray(int[] arr)
	{
		List<Integer> uniqueArr = new ArrayList<>();
		for(int i =0; i<arr.length; i++)
		{
			if(! uniqueArr.contains(arr[i]))
				uniqueArr.add(arr[i]);
		}
		
		System.out.println("Array with unique elements");
		uniqueArr.forEach(e -> System.out.print(e + "\t"));
		
		uniqueArr.sort(null);;		
		int[] sortedArr = new int [uniqueArr.size()];
		for(int i =0; i<uniqueArr.size(); i++)
		{
			sortedArr[i] = uniqueArr.get(uniqueArr.size()-1-i);
		}
		
		return sortedArr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		
		System.out.println("Enter the elements");
		int[] arr = new int[size];
		for(int i =0 ; i<size; i++)
			arr[i] = sc.nextInt();
		
		int[] sortedArr = modifyArray(arr);
		
		System.out.println("\nSorted array: ");
		for(int i : sortedArr)
			System.out.print(i + "\t");
		
		sc.close();
	}

}
