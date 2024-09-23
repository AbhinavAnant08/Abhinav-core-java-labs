package com.deloitte.lab6.ex3;

import java.util.*;

public class Lab6Ex3 {

public static HashMap<Integer, Double> getSquares(List<Integer> num){
		
		HashMap<Integer, Double> numSq = new HashMap<>();
		
		for(int n: num)
			numSq.put(n, Math.pow(n, 2));
		
		return numSq;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
		int n = sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();
		System.out.println("Enter the numbers in list");
		for(int i = 0; i<n; i++)
			arr.add(sc.nextInt());
		
		System.out.println(getSquares(arr));	
		sc.close();
	}
}
